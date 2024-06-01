package mathematics;
import java.util.Scanner;

/**
 * pr1_count_digit
 */
public class pr1_count_digit {

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the any number= ");
        int n=sc.nextInt();
        int count=0;
        while(n>0){
            count++;
            n/=10;

        }
        System.out.println("digit of the num is = "+count);

    }
}