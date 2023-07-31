import java.util.Scanner;

public class Main {
	public static void main(String[] args) { 
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		double res=calculateSumOfSeries(n);
		System.out.println("Sum of series are :"+res);
		
	}
		
	public static double calculateSumOfSeries(int n)
	{
		double sum=0.0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(1/(double)i);
		}
		return sum;
			
	}
	

}
