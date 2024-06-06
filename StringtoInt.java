import java.util.Scanner;

public class StringtoInt {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the string");
        // String n = sc.next();
        myAtoi("    -00042");
    }
    static void myAtoi(String s){
        
        s=s.trim();
        int digit;
        try {
             digit = Integer.parseInt(s);
           
        } catch (NumberFormatException e) {
            if (s.charAt(0)=='-') {
                digit=(int)Math.pow(-2, 31);
            }else{}
            digit=(int)Math.pow(-2, 31)-1;
        }
        System.out.println(digit);
       
    }
}
