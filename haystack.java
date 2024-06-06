import java.util.*;

/**
 * haystack
 */
public class haystack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the haystack");
        String haystack = sc.next();
        System.out.println("Enter the needle");
        String needle = sc.next();

        System.out.println(haystack.indexOf(needle)); 
    


       
    }
}