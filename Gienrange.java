package recursion;

import java.util.Scanner;

public class Gienrange {
	public static void add(int a) {
		if(a==0)return  ;
		add(a-1);
		System.out.print(a);
		
	}
	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number:");
	int n=s.nextInt();
	add(n);
}
}
