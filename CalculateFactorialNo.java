package basicprogram;
import java.util.Scanner;
public class CalculateFactorialNo {
public static void main(String[]args) {
	int num,i,fact=1;
	Scanner sc=new Scanner(System.in);
	num=sc.nextInt();
	
	for(i=1;i<=num;i++) {
	fact=fact*i;
	}
	System.out.println(("factorial of "+num+ "is: " +fact));
	
		
		
	
	
}
}
