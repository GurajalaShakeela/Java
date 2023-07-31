import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		int m=scan.nextInt();
		checkMultiplesOfTen(n,m);
		scan.close();
	}
	public static void checkMultiplesOfTen( int n, int m)
	{
		if(n%m==0)
		{
			System.out.println("The number  "+n+"  is a multiple of  "+m);
		}
		else
		{
			System.out.println("The number  "+n+"  is not a multiple of   "+m);
			
		}
	}

}
