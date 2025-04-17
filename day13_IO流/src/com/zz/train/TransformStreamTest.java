package com.zz.train;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.Serializable;

public class TransformStreamTest implements Serializable {
    private static final long serialVersionUID = -3344979376861282059L;

    public static void main(String[] args) throws IOException {
        FileInputStream fi = new FileInputStream("D:/xzrj/IOTest/dbcp.txt");
        FileOutputStream fo = new FileOutputStream("D:/xzrj/IOTest/dbcp5.txt");

        InputStreamReader inputStreamReader = new InputStreamReader(fi, "GBK");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(fo, "GBK");

        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        BufferedWriter bufferedWriter = new BufferedWriter(outputStreamWriter);

        String str;
        while ((str = bufferedReader.readLine()) != null) {
            bufferedWriter.write(str);
            bufferedWriter.newLine();
            bufferedWriter.flush();
        }
        bufferedWriter.close();
        bufferedReader.close();
    }
}
