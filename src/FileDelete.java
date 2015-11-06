import java.io.File;
import java.io.IOException;

/**
 * Created by Сергей on 06.11.2015.
 */
public class FileDelete {
    public static void main(String... args) throws IOException {
        File file = new File("d:/tmp/1.txt");
        System.out.println(file.exists());
        File file2 = new File("d:/tmp/2.txt");
        file2.createNewFile();
        System.out.println(file2.exists());
        //file2.delete();
        System.out.println(file2.exists());
    }
}
