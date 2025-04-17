package com.zz.train;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class IOExp {

    public static void main(String[] args) throws IOException {
        FileInputStream inputStream= null;
        try {
            File file = new File("D:\\xuexi\\java\\ideajihe\\base202502\\第七章_异常处理\\src\\com\\zz\\train");
            if (file.exists()) {
                System.out.println(111);
            }

            System.out.println(new File(".").getAbsolutePath());
            inputStream = new FileInputStream("D:\\xuexi\\java\\ideajihe\\base202502\\第七章_异常处理\\src\\com\\zz\\train\\test.txt");
            int b;
            b = inputStream.read();
            while (b != -1) {
                System.out.print((char) b);
                b = inputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            inputStream.close();
            System.out.println("end");
        }
    }
}
