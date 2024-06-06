import java.util.LinkedList;
import java.util.Scanner;

public class linkedlist {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList<>();
        LinkedList linkedList2 = new LinkedList<>();
        LinkedList ans = new LinkedList<>();
        Scanner sc = new Scanner(System.in);
        String s1 = "";
        String s2 = "";
        System.out.println("Enter no of nodes in first list");
        int n1 = sc.nextInt();
        System.out.println("Enter  nodes in first list");
        for (int i = 0; i < n1; i++) {

            int val = sc.nextInt();
            linkedList.add(val);
        }
        System.out.println("Enter no of nodes in second list");
        int n2 = sc.nextInt();
        System.out.println("Enter  nodes in second list");
        for (int i = 0; i < n2; i++) {

            int val = sc.nextInt();
            linkedList2.add(val);
        }
        // System.out.println(linkedList.get());
        for (int i = linkedList.size() - 1; i >= 0; i--) {
            s1 = s1 + linkedList.get(i).toString();
        }
        for (int i = linkedList2.size() - 1; i >= 0; i--) {
            s2 = s2 + linkedList2.get(i).toString();
        }
        int digit = Integer.parseInt(s1) + Integer.parseInt(s2);
        String data = "" + digit;
        for (int i = data.length() - 1; i >= 0; i--) {
            int val = Integer.parseInt(data.charAt(i) + "");
            ans.add(val);
        }

        System.out.println(ans);

    }
}
