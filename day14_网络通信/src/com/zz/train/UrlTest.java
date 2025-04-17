package com.zz.train;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class UrlTest {
    public static void main(String[] args) {
        try {
            URL url = new URL("http://localhost:8080/examples/myTest.txt");
            System.out.println("getProtocol() :"+url.getProtocol());//http
            System.out.println("getHost() :"+url.getHost());//localhost
            System.out.println("getPort() :"+url.getPort());//8080
            System.out.println("getPath() :"+url.getPath());///examples/myTest.txt
            System.out.println("getFile() :"+url.getFile());///examples/myTest.txt
            System.out.println("getQuery() :"+url.getQuery());//null

            URL url1 = new URL("https://www.atguigu.com/index.shtml");
            URLConnection urlConnection = url1.openConnection();

        } catch (MalformedURLException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
