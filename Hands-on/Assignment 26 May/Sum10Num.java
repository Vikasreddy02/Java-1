package corejava;

import java.util.*;
public class Sum10Num  
	{  
	public static void main(String[] args)   
		{  
		
			int i, num;
			Scanner sc = new Scanner(System.in); 
			num = sc.nextInt();
			
			System.out.println("Enter Number Count = " + num);  
			
			int sum = 0;  

			for(i = 1; i <= num; ++i)  
				{  

					sum = sum + i;  
				}  
 
			System.out.println("Sum of First 10 Natural Numbers is = " + sum);  
		}  
	}  