import java.util.Scanner;

public class palindromeno {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter  no");
        int n1 = sc.nextInt();
        String temp="";
        for (int i = (n1+"").length()-1; i >=0 ; i--) {
            temp=temp+(n1+"").charAt(i);
        }
        int n2 = Integer.parseInt(temp);

        if (n1==n2) {
            System.out.println("Palindrome");
        }else{
             System.out.println("Not Palindrome");
        }
    }
}
