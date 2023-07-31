import java.util.Scanner;

public class DemoApp {
	public static void main(String[] args) {
		Demo demo=new Demo();
		Scanner scan=new Scanner(System.in);
		int n=scan.nextInt();
		demo.divisibleBy2(n);
		demo.divisibleBy3(n);
		demo.divisibleBy2and5(n);
		demo.divisibleBy3and5(n);
		demo.allEvenNumbers(n);
		demo.allOddNumbers(n);
		scan.close();
		
		
	}

}

