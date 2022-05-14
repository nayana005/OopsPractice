package com.bridgelabz.studentbook;

public class OopsPersonSurvived {
	
	 public static void main (String[] args) {
	        int person = 42;
	        
            // Array for place of a person	     
	        int[] a = new int[person];
	     
	        // Total persons places from 1 to N
	        for (int i = 0; i < person; i++) {
	            a[i] = i + 1;
	        }
	     
	        // Starting the game with 1st person position 0
	        int pos = 0;
	     
	        // Game continues till 1 person is remaining on the end
	        while (a.length > 1)
	        {
	        	// Current person will kill the next person with sword
	        	// Incrementing the position
	            pos++;
	            
	            // To make it in circular position
	            pos %= a.length;
	           
	            // Killing the person at position pos
	            int[] anotherArray = new int[a.length - 1];
	            System.arraycopy(a, 0, anotherArray, 0, pos);
	            System.arraycopy(a, pos + 1, anotherArray, pos,a.length - pos - 1);
	            a = anotherArray;
	        }
	     
	        System.out.println(a[0]);
	   }
}
	


