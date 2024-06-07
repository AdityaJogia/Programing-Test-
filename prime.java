import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter  no");
        int n1 = sc.nextInt();
boolean flag = false;
        for (int i = 2; i < n1/2; i++) {
            if (n1%i==0) {
               flag=true;
                break;
            }
        }
        if (flag) {
             System.out.println("Not Prime");
        }else{
             System.out.println("Prime");
        }
    }
}
