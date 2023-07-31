import java.util.Scanner;

public class AnotherAnswer {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
	}

	public static void identifyCharacter(char ch)
	{
		if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else if(!Character.isLetter(ch))
		{
			System.out.println("Special Symbol");
		}
		else
		{
			switch(Character.toLowerCase(ch))
			{
			case 'a':
			case 'e':
			case 'i':
			case 'o':
			case 'u':
				if(Character.isLowerCase(ch))
				{
					System.out.println("LowerCaseVowel");
				}
				else
				{
					System.out.println("UpperCaseVowel");
				}
				break;
				
			default:
				if(Character.isLowerCase(ch))
				{
					System.out.println("Loercase consonant");
				}
				else
				{
					System.out.println("UppercaseConsonant");
				}
			}
			
		}
			
		}
	}
