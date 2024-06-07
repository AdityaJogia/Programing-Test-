import java.util.Scanner;

public class ascending {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 no");
        int n1 = sc.nextInt();
        System.out.println("Enter 2 no");
        int n2 = sc.nextInt();
        System.out.println("Enter 3 no");
        int n3 = sc.nextInt();

        int largest=0;
        int min=0;
        int mid=0;
        largest= n1>n2?(n1>n3?n1:n3):(n2>n3?n2:n3);
        min = n1<n2?(n1<n3?n1:n3):(n2<n3?n2:n3);
        mid=n1<n2?(n1<n3?n3:n1):(n2<n3?n3:n2);
System.out.println(min+","+mid+","+largest);
        
    }
}