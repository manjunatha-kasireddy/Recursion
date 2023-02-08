package recursion;
import java.util.Scanner;
public class Armstrong 
	{
	int n, sum;
	Armstrong(int n1)
	{
	n=n1;
	sum=0;
	}

	int fnPower(int a, int b)
	{
	if(b==0)
	return 1;
	else
	return a*fnPower(a,b-1);
	}
	void fnPerform()
	{
	int an=n,r;
	long sum1=(long) sum;
	while(an>0)
	{
	r=an%10;
	an=an/10;
	sum1=sum1+fnPower(r,3);                               
	}
	if(n==sum1) 
	System.out.println("armstrong");
	else 
	System.out.println("not armstrong");
	}
	public static void main(String args[])
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("enter number");
	int num=sc.nextInt();
	Armstrong a1=new Armstrong(num);
	a1.fnPerform();
	}
	}

	