package basicprogram;
import java.util.Scanner;
public class SumOfNaturalNo {
	public static void main(String[]args) {
		
	
	
	int i,n,sum=0;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number:");
	n=sc.nextInt();
	for(i=1;i<=n;i++)
		
	{
		sum=sum+i;
	}
		System.out.println("sum of natural number from 1 to " +n+ "is :"+sum);
		
	
		
		
	

}
}
