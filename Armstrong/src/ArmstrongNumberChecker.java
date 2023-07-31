
public class ArmstrongNumberChecker {
	public int numberChecker(int n, int p)
	{
		int rem=0;
		int sum=0;
		
		while(n!=0)
		{
			rem=n%10;
			sum=(int)(sum+Math.pow(rem, p));
			n=n/10;
			
		}
		return sum;
	}

}
