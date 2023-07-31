
public class Method1 {
	public static void main(String[] args) {
		int n=5;
		int fib1=0;
		int fib2=1;
		System.out.print(fib1+" "+fib2+" ");
		fabonacciSeries(5,0,1);
	}
	public static void fabonacciSeries(int n,int fib1,int fib2)
	{
		for(int i=2;i<n;i++)
		{
			int nextNo=fib1+fib2;
		    System.out.print(nextNo+" ");
		    fib1=fib2;
		    fib2=nextNo;
			
		}
	}

}
