package recursion;
import java.util.Scanner;

public class Sumofdigits {
	public static int sum(int b) {
		if(b==1)return 1;
		return b+sum(b-1);
		
	}

	public static void main(String[] args) {
		Scanner a=new Scanner(System.in);
		System.out.println("enter number:");
		int n=a.nextInt();
		System.out.println(sum(n));
	}

}
