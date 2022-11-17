package com.releted;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Random;
import java.util.Set;

public class RamalyAccess {
	
	public static void main(String[] args) {
		
		String [] arr = new String[10];
		
		arr[0] ="Question0";
	    arr[1] ="Question1";
		arr[2] ="Question2";
		arr[3] ="Question3";
		arr[4] ="Question4";
		arr[5] ="Question5";
	    arr[6] ="Question6";
		arr[7] ="Question7";
		arr[8] ="Question8";
		arr[9] ="Question9";
		
		
		
		Random gen = new Random();
		
		LinkedHashSet<Integer> hs =new LinkedHashSet<>();
		
		
		for(int p =0; p<30;p++) {
			
			int q = gen.nextInt(10);
			
			hs.add(q);
			
		}
		
		Iterator<Integer> ltr =hs.iterator();
			while(ltr.hasNext())	{
			
				System.out.println(arr[ltr.next()]);
				}
		
		
		
	  
		
		
    }
}
	
	
	


