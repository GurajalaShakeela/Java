import java.util.Scanner;

public class Calculate {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		int arr[]=new int[scan.nextInt()];
		int n=scan.nextInt();
		for(int i=0;i<=arr.length-1;i++)
		{
			arr[i]=scan.nextInt();
		}
		
		float a=deviationArray(arr, n);
		System.out.printf("%.2f",a);
			
	}
	
	public static int deviationArray(int arr[],int n)
	{
		int sum=0;
		for(int i=0;i<=arr.length-1;i++)
		{
			sum=sum+arr[i];
		}
		int ave=sum/n;
		int standardDeviation=0;
		for(int i=0;i<=arr.length-1;i++) {
			standardDeviation=(int)((int)standardDeviation+Math.pow(arr[i]-ave,2));
		}
		return (int)Math.sqrt(standardDeviation/n);
			
		
		
		
	}

}
