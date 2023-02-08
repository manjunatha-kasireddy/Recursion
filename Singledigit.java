package recursion;
public class Singledigit {	
	public static int sum(int num) {
		  if (num < 10) {
		    return num;
		  }
		  int a = 0;
		  while (num > 0) {	  
		    a += num % 10;
		    num/=10;
		  }
		  return sum(a);
		}
	public static void main(String[] args) {	
		System.out.println(sum(12345));
	}

}
