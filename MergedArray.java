import java.sql.SQLOutput;
import java.util.Scanner;

public class MergedArray {
    public static void main(String[]args){
        int first[],sec[],size1,size2,i,k;
        Scanner sc=new Scanner(System.in);
        //initialize the first array
        System.out.println("Enter  size of array ");
        size1=sc.nextInt();
        first=new int[size1];
        System.out.println("Enter"+size1+"element in the first array");
        for(i=0;i<size1;i++){
            first[i]=sc.nextInt();
        }
        //initilize the second array
        System.out.println("Enter  size of second array ");
        size2=sc.nextInt();
        sec=new int[size2];
        System.out.println("Enter"+size2+"element in the Second array");
        for(i=0;i<size1;i++) {
            sec[i] = sc.nextInt();
        }
            // initialise the third array
        int[] third = new int[size1 + size2];

            //assign first array in third array
            for(i=0;i<size1;i++)
            {
                third[i]=first[i];//third[0]=first[0]
            }
//assign I value into k
            k=1;
            //assign second array into third array
            for(i=0;i<size2;i++){  //it willl indicate the second array
                third[k++]=sec[i];

            }
            // print the third array after merging the array
            System.out.println("And the result after merging::");
            for(i=0;i<third.length;i++){
                System.out.println(third[i] +  " ");
            }
        }
    }

