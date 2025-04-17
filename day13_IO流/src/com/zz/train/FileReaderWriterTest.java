package com.zz.train;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileReaderWriterTest {
    public static void main(String[] args) {
        //testFileWriter();

        //testFileReader();


    }

    private static void testFile1() {
        //FileInputStream fileInputStream = new FileInputStream(new File(""));
    }

    private static void testFileWriter() {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(new File("D:/1/33.txt"));
            fileWriter.write("我是张小凡");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileWriter != null) {


                try {
                    fileWriter.flush();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    private static void testFileReader() {
        FileReader fileReader = null;
        try {
            fileReader = new FileReader(new File("D:/1/33.txt"));
            char[] buf = new char[1024];
            int len;
            while ((len = fileReader.read(buf)) != -1) {

                System.out.println(new String(buf, 0, len));
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
            }
        }
    }
}
