import java.util.Scanner;

public class Method {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		
		int n=scan.nextInt();
		int fib1=scan.nextInt();
		int fib2=scan.nextInt();
		System.out.print(fib1+" "+fib2+" ");
		Method3.fabonacciSries(n,fib1,fib2);
		scan.close();
		
	}

}
