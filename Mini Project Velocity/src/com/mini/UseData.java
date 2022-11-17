package com.mini;


import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class UseData {
	
	static int counter =0; 
	
	public static int getscore() {
	
		LinkedHashMap<String, String> hs = RetriveData.getRecordInLinkedHashmap();
		
		
		Set<String> set =hs.keySet();
		//Set<String> set1 =hs.keySet();
         
		 Iterator<String> itr1 =set.iterator();
	     int ctr =0;
	     String[] arr  =new String[10];
	     String[] arr1  =new String[10];
	     
	     while(itr1.hasNext()) {
				String i =itr1.next();
				
				
			     arr[ctr]=i;
			     arr1[ctr]=i;
		
				ctr++;
		  }
	     
	   
		int que =1;
		
         Random gen = new Random();
		
		LinkedHashSet<Integer> lhs =new LinkedHashSet<>();
		
		
		for(int p =0; p<50;p++) {
			
			int q = gen.nextInt(10);
			
			lhs.add(q);
			
		}
		
		Iterator<Integer> ltr =lhs.iterator();
			while(ltr.hasNext())
		{
			int m=ltr.next();
			 
			 if(arr1[m]==arr[0]) {
				
				System.out.println("Question no"+que+") "+arr[0]);
				System.out.println("A) James Bond");
				System.out.println("b) James gosling");
				System.out.println("c) James keller");
				System.out.println("d) Dennis Ritchie");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='b') {
					counter ++;
				}
				
			 }else  if(arr1[m]==arr[1]) {
					
			   System.out.println("Question no"+que+") "+arr[1]);
			   System.out.println("A) 1995");
			   System.out.println("b) 1994");
			   System.out.println("c) 1955");
			   System.out.println("d) 1984");
					
			   Scanner sc = new Scanner(System.in);
			   System.out.println("Enter the ans :-");
			   char user = sc.next().charAt(0);
					
				if(user =='a') {
						counter ++;
					}
					
			 }else if(arr1[m]==arr[2]) {
						
						
				 System.out.println("Question no"+que+") "+arr[2]);
				 
						
						
				 System.out.println("A) Ten");
				 System.out.println("b) eight");
				 System.out.println("c) Six");
				 System.out.println("d) Twelve");
						
				 Scanner sc = new Scanner(System.in);		
				 System.out.println("Enter the ans :-");
                 char user = sc.next().charAt(0);
				
                 
				  if(user =='b') {
					  counter ++;
						
				  }
						
			 }else  if(arr1[m]==arr[3]) {
				 
							
			   	System.out.println("Question no"+que+") "+arr[3]);
				System.out.println("A) Zero");
    		   	System.out.println("b) double quotes ");
				System.out.println("c) null");
			 	System.out.println("d) none of these");
				
			 	Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='c') {
								
			   		counter ++;
							
			   	}
						
			 }else   if(arr1[m]==arr[4]) {
							
							
				 System.out.println("Question no"+que+") "+arr[4]);
				 System.out.println("A) 16 bits");
				 System.out.println("b) 8 bits");
				 System.out.println("c) 32 bits");
				 System.out.println("d) 64 bits");
							
							
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter the ans :-");
				 char user = sc.next().charAt(0);
				
				 if(user =='a') {
							
					 counter ++;
							
				 }
						
			 }else if(arr1[m]==arr[5]) {
							
							
				 System.out.println("Question no"+que+") "+arr[5]);
				 System.out.println("A) JRE");
				 System.out.println("b) JVM");
				 System.out.println("c) JDK");
				 System.out.println("d) none of these");
							
							
				 Scanner sc = new Scanner(System.in);
				 System.out.println("Enter the ans :-");
				 char user = sc.next().charAt(0);
				
				 if(user =='c') {
							
					 counter ++;
							
				 }
							
						
			 } else if(arr1[m]==arr[6]) {
				
				System.out.println("Question no"+que+") "+arr[6]);
				
				System.out.println("A) Use null pointer");
				System.out.println("b) Robust");
				System.out.println("c) Object Oriented");
				System.out.println("d) Platform indipendant");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='a') {
					counter ++;
				}
				
			} else  if(arr1[m]==arr[7]) {
				
				System.out.println("Question no"+que+") "+arr[7]);
				System.out.println("A) .txt");
				System.out.println("b) .class");
				System.out.println("c) .java");
				System.out.println("d) .mp3");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='c') {
					counter ++;
				}
				
			
			}else  if(arr1[m]==arr[8]) {
				
				System.out.println("Question no"+que+") "+arr[8]);
				System.out.println("A) Polymorphism");
				System.out.println("b) Compilation");
				System.out.println("c) Encapsulation");
				System.out.println("d) Abstraction");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='b') {
					counter ++;
				}
			
				
			}else  if(arr1[m]==arr[9]) {
				
				System.out.println("Question no"+que+") "+arr[9]);
				System.out.println("A) for");
				System.out.println("b) select");
				System.out.println("c) print");
				System.out.println("d) if");
				
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the ans :-");
				char user = sc.next().charAt(0);
				
				if(user =='d') {
					counter ++;
				}
			
			
			}
			
			
		que++;	
			
			
	}
		
    		
	int score = counter;
	return score;

  }
	
	
	
}