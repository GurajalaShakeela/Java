import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
  		MainApp m1=new MainApp();
		Scanner scan=new Scanner(System.in);
		int m=scan.nextInt();
		int n=scan.nextInt();
		int a=m1.greatestNumber(m, n);  //non-static method
//		int a=MainApp.greatestNumber(m, n); //static method
		System.out.println("GCD  "+a);
		scan.close();
	}

}
