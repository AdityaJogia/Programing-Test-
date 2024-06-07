import java.util.Scanner;

public class arrayduplicate {

    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int[] n = new int[size];
        
System.out.println("Enter no");
        for (int i = 0; i < n.length; i++) {
            n[i]=sc.nextInt();
            
        }
    }
}