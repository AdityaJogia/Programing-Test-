public class hello {
    public static void main(String[] args) {
        String str = "Hello";
        String temp="";
        for (int i = 0; i < str.length(); i++) {
            System.out.println(temp+=str.charAt(i));
        }
    }
}
