package SampleJavaPrograms;

public class RightTrianglePattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, row=5;  
		//outer loop for rows  
		for(i=0; i<row; i++)                                   // for(i=0;0<3;)(true)
		
		{   
		//inner loop for columns  
		for(j=0; j<=i; j++)   
		{   
		//prints stars   
		System.out.print("* ");   
		}   
		//throws the cursor in a new line after printing each line  
		System.out.println();   
		}   
		
	}

}
