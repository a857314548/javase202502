package com.zz.train;

import java.io.*;

public class BufferedRedWritTest {
    public static void main(String[] args) {
        // 文件拷贝1
        //fileCopy1();

        //分别使用节点流：FileInputStream、FileOutputStream和
        //      缓冲流：BufferedInputStream、BufferedOutputStream
        //实现文本文件/图片/视频文件的复制。并比较二者在数据复制方面的效率
        testFile1();
        testFile2();

    }

    //缓冲流：BufferedInputStream、BufferedOutputStream实现文本文件复制
    private static void testFile2() {
        long startTime = System.currentTimeMillis();
        BufferedInputStream bi = null;
        BufferedOutputStream bo = null;
        try {
            bi = new BufferedInputStream(new FileInputStream(new File("D:/xzrj/IOTest/02.JPG")));
            bo = new BufferedOutputStream(new FileOutputStream(new File("D:/xzrj/IOTest/02target.png")));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bi.read(bytes)) != -1) {
                bo.write(bytes, 0, len);
            }
            bo.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                bo.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                bi.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        long endTime = System.currentTimeMillis();
        System.out.println("缓冲流拷贝用时:" + (endTime - startTime));
    }

    //节点流：FileInputStream、FileOutputStream实现文本文件复制
    private static void testFile1() {
        long startTime = System.currentTimeMillis();
        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;
        try {
            fileInputStream = new FileInputStream(new File("D:/xzrj/IOTest/03.JPG"));
            fileOutputStream = new FileOutputStream(new File("D:/xzrj/IOTest/03target.JPG"));
            byte[] byan = new byte[1024];
            int len;
            while ((len = fileInputStream.read(byan)) != -1) {
                fileOutputStream.write(byan, 0, len);
            }
            fileOutputStream.flush();

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
        long endTime = System.currentTimeMillis();
        System.out.println("拷贝用时:" + (endTime - startTime));
    }

    private static void fileCopy1() {
        BufferedReader br = null;
        BufferedWriter bw = null;
        try {
            br = new BufferedReader(new FileReader("D:/xzrj/IOTest/source.txt"));
            bw = new BufferedWriter(new FileWriter("D:/xzrj/IOTest/target.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                bw.write(str);
                bw.newLine();
            }
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

            if (bw != null) {
                try {
                    bw.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (br != null) {
                    try {
                        br.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }

            }
        }
    }
}