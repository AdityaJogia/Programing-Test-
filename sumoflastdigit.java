import java.util.Scanner;

public class sumoflastdigit {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 no");
        int n1 = sc.nextInt();
        System.out.println("Enter 2 no");
        int n2 = sc.nextInt();

      int   temp = n1%10;
       int  temp2 =  n2%10;

         System.out.println(temp+temp2);
           
       
  }   
}
