import java.util.Scanner;

public class ReverseApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		Reverse r1=new Reverse();
		int res=r1.reverseTheNo(n);
		System.out.println("Reverse of :"+n+" Number  :"+res);
		if(res==n)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not palindrome");
		}
		
	}

}
