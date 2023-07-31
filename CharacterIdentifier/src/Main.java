import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		char ch=scan.next().charAt(0);
		identifyCharacter(ch);
		
	}
	public static void identifyCharacter(char ch)
	{
		if(Character.isLowerCase(ch))
		{
			if(isVowel(ch))
			{
				System.out.println("LowerCase Vowel");
			}
			else
			{
				System.out.println("LowerCase Consonant");
			}
		}
		else if(Character.isUpperCase(ch))
		{
			if(isVowel(ch))
			{
				System.out.println("Uppercase Vowel");
			}
			else
			{
				System.out.println("UpperCase Consonant");
			}
		}
		else if(Character.isDigit(ch))
		{
			System.out.println("Digit");
		}
		else
		{
			System.out.println("Special Character");
		}
		 
	}
	public static boolean isVowel(char ch)
	{
		ch=Character.toLowerCase(ch);
		return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u';
	}

}