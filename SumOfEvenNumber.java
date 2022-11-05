package basicprogram;
import java.util.Scanner;

public class SumOfEvenNumber {
	public static void main(String[]args){
		int num,i,sum=0;
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();
		for(i=0;i<=num;i++) {
			
			if(i%2==0)
				sum=sum+1;
		}
				System.out.println("sum of natural number from 1 to " +num+ "is :"+sum);
			
			
		
		}
	
}

