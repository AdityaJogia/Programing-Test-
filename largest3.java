import java.util.Scanner;

public class largest3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 no");
        int n1 = sc.nextInt();
        System.out.println("Enter 2 no");
        int n2 = sc.nextInt();
        System.out.println("Enter 3 no");
        int n3 = sc.nextInt();

        int largest = n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
         System.out.println("Largest : : "+ largest);
    }
}