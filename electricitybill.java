import java.util.Scanner;

public class electricitybill {
    public static void main(String[] args) {
          Scanner sc = new Scanner(System.in);
        System.out.println("Enter units");
        int units = sc.nextInt();
        double charge = 100;
        if (units>300) {
            charge = charge+(200*0.80)+(100*0.90)+(units-300);
        }else if (units>200 && units<=300) {
            charge = charge+(200*0.80)+((units-200)*0.90);
        }
        else{
            charge = charge + (units*0.80);
        }
        if (charge>300) {
            charge=charge+(charge*(12.36/100));
        }
        System.out.println("Bill Amount : : " + charge);
    }   
}
