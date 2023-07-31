import java.util.Scanner;

public class PlanetExplorerApp {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter radius of sphere value:");
		double radius=scan.nextDouble();
		PlanetExplore explorer = new PlanetExplore();
        System.out.printf("%.2f",explorer.calculateSurfaceArea(radius));
        scan.close();
	}

}
