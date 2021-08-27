package SampleJavaPrograms;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		 
			  
			  int r,sum=0,temp;    
			 // int n=454;//It is the number variable to be checked for palindrome  
			 // Scanner Scan = new Scanner(System.in);
			  //n= Scan.nextInt();
			  Scanner in = new Scanner(System.in);   
		      System.out.println("Enter a string/number to check if it is a palindrome:");  
		      int n = in.nextInt();  
			  temp=n;    
			  while(n>0){    
			   r=n%10;  //getting remainder  
			   sum=(sum*10)+r;    
			   n=n/10;    
			  }    
			  if(temp==sum)    
			   System.out.println("palindrome number ");    
			  else    
			   System.out.println("not palindrome");    
			}  
			
	}


