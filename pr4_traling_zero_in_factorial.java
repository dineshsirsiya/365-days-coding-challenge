package mathematics;
import java.util.Scanner;

/**
 * pr4_traling_zero_in_factorial
 */
public class pr4_traling_zero_in_factorial {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any num= ");
        int n=sc.nextInt();
        int fact=1;
        int count=0;
        while(n>0){
            fact*=n;
            n-=1;
        }
        System.out.println("factorial of the num is = "+fact);
        while(fact>0){
            if(fact%10==0){
                count++;
            }
            fact/=10;
        }
        System.out.println("the trailing zero in factorial of num is = "+count);



        
    }
}