package mathematics;
import java.util.Scanner;
public class pr2_palindrome_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the any num = ");
        int n=sc.nextInt();
        int revsenum=0;
        int realnum=n;
        int rem=0;
        while(n>0){
            rem=n%10;
            revsenum=revsenum*10+rem;
            n/=10;


        }
        if(realnum==revsenum){
            System.out.println("your num is palindrome");
        }
        else{
            System.out.println("your num is not palindrome ");
        }
    }
}
