package StreamIO;

import java.io.*;
import java.nio.*;

/**
 * Created by Сергей on 20.11.2015.
 */
public class IO_Test {
    public static void main(String[] args) throws IOException {
        InputStream is = new FileInputStream("D:\\TMP\\tmp_IO_1.txt");

        Reader reader = new FileReader("D:\\TMP\\tmp_IO_2.txt");
        reader.read();
        String str = "62";
        System.out.println(Integer.parseInt(str, 10));
        int s = 0;
        int k;
        while ((k = reader.read()) != -1) {
            //if (k == Integer.parseInt(str, 10)) {
                s++;
            //}
        }
        System.out.println("Sign '" + str + "' met " + s + " times");
    }
}
