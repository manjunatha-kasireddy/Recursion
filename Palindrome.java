package recursion;
import java.util.Scanner;
public class Palindrome
{
   static int palin(int number, int temp)
   {
      if(number == 0)
         return temp;
      temp = (temp * 10) + (number % 10);
      return palin(number / 10, temp);
   }
   public static void main(String[] args)
   {
	   Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int n=s.nextInt();
      int temp = palin(n, 0);
      if(temp == n)
      {
         System.out.println("number is palindrome.");
      }
      else
      {
         System.out.println("number is not palindrome.");
      }
   }
}