import java.io.File;
import java.io.IOException;

public class copyfile {
    public static void main(String[] args) {
        File file = new File("temp.txt");
      try {
        boolean temp = new File("code.txt").createNewFile();
        File code =new File("code.txt");
        System.out.println(file);
    } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
    }

      
    }
}
