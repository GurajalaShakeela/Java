import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int res=calculateSumOfDigits(n);
		System.out.println(res);
		}
	public static int calculateSumOfDigits(int n)
	{
		int sum=0;
		int rem=0;
		while(n!=0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		return sum;
		
	}

}
