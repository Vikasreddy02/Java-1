package corejava;

import java.util.*;

public class PrintStar   
	{   
		public static void main(String args[])   
		{ 
			System.out.print("Enter A Number Of Rows: ");   
			Scanner sc = new Scanner(System.in);  
			int Row = sc.nextInt();
			System.out.println();
			
				for(int i=0; i<Row; i++)   
					{   
						for(int j=0; j<=i; j++)   
							{   
								System.out.print("* ");   
							}   
								System.out.println();   
					}   
		}   
	}  