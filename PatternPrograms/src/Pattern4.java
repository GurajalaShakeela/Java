import java.util.Scanner;

public class Pattern4 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		for(int i=0;i<n;i++)
		{
			System.out.print("*"+" ");
		}
		System.out.println();
		scan.close();
	}

}
