package basicprogram;
import java.util.Scanner;
public class FindFirstLastDigitNumber {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in); 
    
		int n=sc.nextInt();
		//find last number
		int lastdigit=n%10;
		//store in tempory variable
		int temp=n;
		//count digit
		int c=0;
		while(temp>0)
		{
			c++;
			temp=temp/10;
			
		}
		int d=c-1;
		int f=n/((int)Math.pow(10, d));
				System.out.println(f+l);
		
			
			
	}	
	}

