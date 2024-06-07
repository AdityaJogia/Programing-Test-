import java.util.Scanner;

public class series {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter  no");
        int temp = 0;
        int n1 = sc.nextInt();
        for (int i = 1; i < n1+1; i++) {
            temp=temp+i;
            System.out.print(temp+" ");
        }
    }
}
