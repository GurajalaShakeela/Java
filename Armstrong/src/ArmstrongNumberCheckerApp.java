import java.util.Scanner;

public class ArmstrongNumberCheckerApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int p=0;
		while(n!=0)
		{
			n=n/10;
			p++;
		}
		ArmstrongNumberChecker armstrong=new ArmstrongNumberChecker();
		int sum=armstrong.numberChecker(n,p);
		System.out.println(sum);
	
		if(n==sum)
		{
			System.out.println("Armstrong Number");
		}
		else
		{
			System.out.println("Not a Armstrong Number");
		}
		scan.close();
	}

}
