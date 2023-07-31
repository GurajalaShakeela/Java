import java.util.Scanner;

public class FinanceCalenderApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		double pricipal=scan.nextDouble();
		double rate=scan.nextDouble();
		double time=scan.nextDouble();
		
		FinanceCalender calculator = new FinanceCalender();

		System.out.printf("%.2f",calculator.calculateSimpleInterest(pricipal, rate, time));
		scan.close();
	}

}
