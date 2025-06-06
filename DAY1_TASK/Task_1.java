package addon_day1;

public class Task_1 {
	public static int fact(int n)
	{
		if(n==1)
		{
			return 1;
		}
		return n*fact(n-1);
	}
	public static int fib(int num)
	{
		if(num<=1)
		{
			return 1;
		}
		return fib(num-1)+fib(num-2);
		
	}
 public static void main(String[] args) {
 System.out.println(fact(5));
 for( int i=0;i<=10;i++)
 {
 System.out.println(fib(i));
 }
}}


