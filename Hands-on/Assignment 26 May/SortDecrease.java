package corejava;

import java.util.*;

public class SortDecrease{

    public static void main(String[] args)
    {
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter Array Length: ");
	
	Integer a = sc.nextInt();
	
	Integer b[]= new Integer[a];
	System.out.print("\nEnter: "+ a + " Elements To Store In Array\n");
	
	for (int i=0; i<a;i++) {
		b[i]=sc.nextInt();
	}
	
        Arrays.sort(b);
        System.out.println("Increasing Order a[] : \n"+Arrays.toString(b));

        Arrays.sort(b, Collections.reverseOrder());

        System.out.println("\n Decreasing Order a[] : \n"+Arrays.toString(b));
    }
}