
public class Method3 {
	 static void fabonacciSries(int n,int fib1,int fib2)
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
