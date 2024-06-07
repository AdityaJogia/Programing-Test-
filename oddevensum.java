import java.util.Scanner;

public class oddevensum {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] n = new int[size];
        int even=0;
        int odd=0;
System.out.println("Enter no");
        for (int i = 0; i < n.length; i++) {
            n[i]=sc.nextInt();
            if (n[i]%2==0) {
                even=even+n[i];
            }else{
                 odd=odd+n[i];
            }
        }
        System.out.println("Odd :: " + odd);
        System.out.println("even :: " + even);

       
    }
}
