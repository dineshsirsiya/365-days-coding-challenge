package mathematics;
import java.util.Scanner;

public class pr3_factorial {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the any num =");
        int n=sc.nextInt();
        int fact=1;
        while(n>0){
            fact*=n;
            n--;
        }
        System.out.println("the factorial of the number = "+fact);
    }
}
