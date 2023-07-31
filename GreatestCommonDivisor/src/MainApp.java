
public class MainApp {
//	public static int greatestNumber(int m,int n)  //Static method
    int greatestNumber(int m, int n)
	{
		while(n!=0)
		{
			int rem=m%n;
			m=n;
			n=rem;
		}
		return m;
	}

}
