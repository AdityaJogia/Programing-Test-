import java.util.Scanner;

public class intseq {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);

        System.out.println("Enter n");
        int n = sc.nextInt();
        String seq="";
        for (int i = 1; i < n+1; i++) {
            seq=seq+(i);
        }
        System.out.println(seq);
        System.out.println(seq.charAt(n-1));
    }
}
