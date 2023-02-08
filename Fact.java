package recursion;
import java.util.Scanner;

public class Fact {
	public static int fact(int a) {
		if(a==0)return 1;
		return a*fact(a-1);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
		System.out.println(fact(n));
	}

}
