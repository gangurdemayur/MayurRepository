package com.mini;


import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

public class CheckingWhileLoop {
	
	static int counter =0; 
	
	
	public static void main(String[] args) {
		
		
		LinkedHashMap<String, String> hs = RetriveData.getRecordInLinkedHashmap();
		
		Set<String> set =hs.keySet();

		Iterator<String> itr1 =set.iterator();
	     int ctr =0;
	     String[] arr  =new String[10];
	     String[] arr1 = new String[10];
	     
	     while(itr1.hasNext()) {
				String i =itr1.next();
				
		
			
				arr[ctr]=i;
				arr1[ctr]=i;
				
				ctr++;
				
	     }
	     
		for(int i =0; i<3;i++)
		
		{
//			System.out.println(arr[i]);
//			System.out.println(arr1[i]);
			
	//	}
	
			
			if(arr1[i]==arr[0]) {
				
				System.out.println("Which one of the following is not a java feature?");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='a') {
					counter ++;
				
				}
				System.out.println(i);
				
			}else if(arr1[i]==arr[1]) {
				
				System.out.println(arr[1]);
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='b') {
					counter ++;
					
					
				}
				System.out.println(i);
				
			}else  if(arr1[i]==arr[2]) {
				
				System.out.println(arr[2]);
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='c') {
					counter ++;
				
				}
				System.out.println(i);
					
		
	   }
		
			

     }
		int score = counter;
		//System.out.println("Your Score is"+score);
	
   }
}



