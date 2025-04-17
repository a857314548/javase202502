package com.zz.train;

import java.io.File;
import java.io.IOException;

public class FileAddDeleteTest {
    public static void main(String[] args) throws IOException, NoSuchFieldException {

        //fileTest1();

        fileTest2();
    }

    private static void fileTest2() throws NoSuchFieldException {
        //创建目录对象
        File file = new File("D:/1");
        // 判断
        if (!file.exists()) {
            throw new NoSuchFieldException();
        }
        //打印
        //拓展1：并计算指定目录占用空间的大小
        System.out.println(printFileName(file));
        //拓展2：删除指定文件目录及其下的所有文件
        File file1 = new File("D:/xzrj/IOTest/dir1");
        deleteDirFile(file1);
    }

    private static void deleteDirFile(File file1) {
        if (file1.isDirectory()) {
            File[] files = file1.listFiles();
            for (File file : files) {
                deleteDirFile(file);
            }
        }
        //最后删自己,无论是文件还是文件夹都要走这一步
        file1.delete();
    }

    //递归调用自己
    private static long printFileName(File files) {
        int size = 0;
        if (files.isDirectory()) {
            for (File file : files.listFiles()) {
                size += printFileName(file);
            }
        } else {
            size += files.length();
            System.out.println(files.getName());
        }
        return size;
    }

    private static void fileTest1() throws IOException {
        //1. 利用File构造器，new 一个文件目录file
        File file = new File("D:/xzrj/IOTest/FileAddDeleteTest");
        if (!file.exists()) {
            file.mkdirs();
        }
        //1)在其中创建多个文件和目录
        File file1 = new File(file, "dir1");
        if (!file1.exists()) {
            file1.mkdirs();
        }
        File file11 = new File(file1, "test1.txt");
        if (!file11.exists()) {
            file11.createNewFile();
        }
        File file22 = new File(file1, "test2.txt");
        if (!file22.exists()) {
            file22.createNewFile();
        }
        File file2 = new File(file, "dir2");
        if (!file2.exists()) {
            file2.mkdirs();
        }
        File file33 = new File(file2, "test3.txt");
        if (!file33.exists()) {
            file33.createNewFile();
        }
        File file44 = new File(file2, "test4.txt");
        if (!file44.exists()) {
            file44.createNewFile();
        }

        File file55 = new File(file2, "hello.jpg");
        if (!file55.exists()) {
            file55.createNewFile();
        }
        //2)编写方法，实现删除file中指定文件的操作
        file22.delete();
        file44.delete();

        //2. 判断指定目录下是否有后缀名为.jpg的文件，如果有，就输出该文件名称
        String[] list = file2.list();
        for (String s : list) {
            if (s.endsWith(".jpg")) {
                System.out.println(s);
            }
        }

        //. 遍历指定目录所有文件名称，包括子文件目录中的文件。
        File[] files = file.listFiles();
        for (int i = 0; i < files.length; i++) {
            String name = files[i].getName();
            if (files[i].isDirectory()) {

            } else {
                System.out.println(name);
            }
        }

        //拓展1：并计算指定目录占用空间的大小
        //拓展2：删除指定文件目录及其下的所有文件
    }
}
