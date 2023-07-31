
public class Demo {
	
	public void divisibleBy2(int n)
	{
		System.out.print("Display all numbers divisible by 2 is: ");
		for (int i=1;i<=n;i++)
		{
			if(i%2==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
			
	}
	public void divisibleBy3(int n)
	{
		System.out.print("Display all numbers divisible by 3 is: ");
		for (int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	public  void divisibleBy5(int n)
	{
		System.out.print("Display all numbers divisible by 5 is: ");
		for (int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public void divisibleBy2and5(int n)
	{
		System.out.print("Display all numbers divisible by 2 and 5 is :");
		for (int i=1;i<=n;i++)
		{
			if(i%2==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public void divisibleBy3and5(int n)
	{
		System.out.print("Display all numbers divisible by 3 and 5 is: ");
		for (int i=1;i<=n;i++)
		{
			if(i%3==0 && i%5==0)
			{
				System.out.print(i+" ");
			}
		}
		System.out.println();
	}
	
	public void allEvenNumbers(int n)
	{
		System.out.print("Display all even numbers : ");
		for (int i=1;i<=n;i++)
		{
			if(i%3==0)
			{
				if(i%2==0)
				{
				System.out.print(i+" ");
				}
			}
		}
		System.out.println();
	}
	public void allOddNumbers(int n)
	{
		System.out.print("Display all odd numbers : ");
		for (int i=1;i<=n;i++)
		{
			if(i%5==0)
			{
				if(i%2!=0)
				{
				System.out.print(i+" ");
				}
			}
		}
		System.out.println();
	}







}
