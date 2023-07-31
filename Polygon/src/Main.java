import java.util.Scanner;

public class Main {
	public static void identifyPolygon(int sides) {
		switch(sides)
		{ 
		case 3:
			System.out.println("Triangle");
			break;
		case 4:
			System.out.println("Quadrilateral");
			break;
		case 5:
			System.out.println("pentagon");
			break;
		case 6:
			System.out.println("hexagon");
			break;
		case 7:
			System.out.println("Heptagon");
			break;
		case 8:
			System.out.println("Octagon");
			break;
		
		case 9:
			System.out.println("Nonagon");
			break;
		default:
		    System.out.println("Decagon");
		
		}
		
		
	}
	public static void main(String[] args) {
		Scanner scan= new Scanner(System.in);
		int sides=scan.nextInt();
		identifyPolygon(sides);
		
	}

}
