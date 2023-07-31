import java.util.Scanner;

public class Main {
	public static void getProduct(String productCode) {
		switch(productCode)
		{
		case "p01":
			System.out.println("Coca cola");
			break;
		case "p02":
			System.out.println("thumbs up");
			break;
		default:
			System.out.println("Sprite");
		
			
			
		}
		
	}
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String code=scan.next();
		getProduct(code);
		
		
	}

}
