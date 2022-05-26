package corejava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class IterateArray {
  public static void main(String[] args){
	 String a;
	  int b,c;
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Array Name: ");
		
		a = sc.next();
		
		Scanner sn = new Scanner(System.in);
		
		System.out.print("Enter Array Age: ");
		
		b = sn.nextInt();
		
		Scanner s = new Scanner(System.in);
		
		System.out.print("Enter Array Student ID: ");
		
		c = s.nextInt();

    
    ArrayList<String> Details = new ArrayList<>();

    
    Details.add(" "+ a);
    Details.add(" "+ b);
    Details.add(" "+ c);
    
    System.out.print("\n Array List: ");
    Iterator itr=Details.iterator();  
	while(itr.hasNext()){  
		
		System.out.print(itr.next());  
	}  
 
  }
}