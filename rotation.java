import java.util.Scanner;

public class rotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // System.out.println("Enter the length");
        // int n = sc.nextInt();
        int arr[] = {4,5,6,7,0,1,2};
        // System.out.println("Enter the nos");
        // for (int i = 0; i < arr.length; i++) {
        //     arr[i] = sc.nextInt();
        // }
       
        int y = arr.length - 1;
        int min = arr[0];
        for (int i = 1; i < arr.length / 2; i++) {
            if (arr[i]<min) {
                min =arr[i];
            }else if(arr[y]<min){
                    min=arr[y];
            }
            y--;
        }
        System.out.println(min);

    }
}
