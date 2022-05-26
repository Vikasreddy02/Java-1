package corejava;

import java.util.ArrayList;
import java.util.Scanner;

class asdfg {
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

    
    ArrayList<String> languages = new ArrayList<>();

    
    languages.add(" "+ a);
    languages.add(" "+ b);
    languages.add(" "+ c);
    System.out.println("ArrayList: " + languages);
  }
}