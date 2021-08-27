package SampleJavaPrograms;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i,fact=1;  
		Scanner in = new Scanner(System.in);   
	      System.out.println("Enter a number:");  
	      int number = in.nextInt(); 
		 // int number=5;//It is the number to calculate factorial    
		  for(i=1;i<=number;i++){    
		      fact=fact*i;    
		  }    
		  System.out.println("Factorial of "+number+" is: "+fact);    
	}

}
