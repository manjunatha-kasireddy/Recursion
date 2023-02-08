package recursion;

import java.util.Scanner;
public class StrongNumber {
	static int Factorial(int num)
	{
		   if(num<=0)
		    return 1;
		   else
		   return num*Factorial(num-1);
		}
	int sum=0;
	int check_StrongNumber(int num)
	{
	    int fact;
	    
	     if(num>0)
	     {
	         fact=1;
	         int rem=num%10;
	         check_StrongNumber(num/10);
	         fact=Factorial(rem);
	         sum+=fact;
	     }
	     return sum;
	     }	

	public static void main(String[] args) {
		Scanner cs=new Scanner(System.in);
	    int num;
	    System.out.print("Enter a number:");
	    num=cs.nextInt();
	    StrongNumber ob=new StrongNumber();
	    if(ob.check_StrongNumber(num)==num)
	    	System.out.print("It is a Strong Number.");
	       else
	    	   System.out.print("It is not a Strong Number.");
	   
	}
}