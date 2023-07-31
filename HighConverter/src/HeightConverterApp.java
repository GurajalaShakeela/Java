import java.util.*;
public class HeightConverterApp {
	public static void main(String[] args) {

		HeightConverter converter = new HeightConverter();
		Scanner scan=new Scanner(System.in);
		double inches = scan.nextDouble();
		System.out.println(converter.convertInchesToFeet(inches));
        scan.close();
	}
}
