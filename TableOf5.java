package basicprogram;
import java.util.Scanner;

public class TableOf5 {
	public static void main(String[]args) {
		//assingning variables into intiger
		int num,i;
		System.out.println("Multiplication of 5");
		Scanner sc=new Scanner(System.in);
		num=sc.nextInt();//get input from variables
		
		for(i=1;i<=10;i++)
	
			System.out.println(num+"*"+i+ "=" +num*i);
		
		
	}
	

}
