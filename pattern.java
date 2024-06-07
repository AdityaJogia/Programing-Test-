import java.util.Scanner;

public class pattern {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  no");

    int n1 = 10;
    for (int i = 0; i < n1; i++) {
      for (int j = 0; j < n1; j++) {

        if (i == 0 || i == n1 - 1 || j == 0 || j == n1 - 1) {

          System.out.print("# ");
        } else {

          System.out.print("  ");
        }
          
      }
      System.out.println();
    }
  }
}
