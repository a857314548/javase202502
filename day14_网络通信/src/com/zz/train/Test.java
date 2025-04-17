package com.zz.train;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Test {
    public static void main(String[] args) throws IOException {
        // IP 和 端口号
        //test1();

        //testSocket();

        //testServerSocket();

        //1.客户端发送内容给服务端，服务端将内容打印到控制台上。
        //2.客户端发送文件给服务端，服务端将文件保存在本地。
        //3.从客户端发送文件给服务端，服务端保存到本地。并返回“发送成功”给
        //客户端。并关闭相应的连接。
        testSocket2();
    }

    private static void testSocket2() throws IOException {
        Socket socket = new Socket("127.0.0.1", 8888);
        OutputStream outputStream = socket.getOutputStream();
        InputStream inputStream = socket.getInputStream();
        outputStream.write("我是张小凡".getBytes());
        outputStream.flush();
        socket.shutdownOutput();

        byte[] data = new byte[1024];
        int len;
        while ((len = inputStream.read(data)) != -1) {
            System.out.println(new String(data, 0, len));
        }


        ServerSocket serverSocket = new ServerSocket(8888);
        Socket accept = serverSocket.accept();
        System.out.println("一个客户端连接成功!");
        InputStream serverInputStream = accept.getInputStream();
        OutputStream serverOutputStream = accept.getOutputStream();
        byte[] serverByte = new byte[1024];
        int serverLen;
        while ((serverLen = serverInputStream.read(serverByte)) !=-1) {
            System.out.println(new String(serverByte,0,serverLen));
        }
        serverOutputStream.write("登录成功!!".getBytes());
        serverOutputStream.flush();
        socket.close();
        serverSocket.close();
    }

    private static void testServerSocket() throws IOException {
        ServerSocket serverSocket = new ServerSocket();
        Socket socket = serverSocket.accept();
        InputStream inputStream = socket.getInputStream();
        byte[] bytes = new byte[1024];
        int read = inputStream.read(bytes);
        String str = new String(bytes, 0, read);
        System.out.println(socket.getInetAddress().toString() + ":" + str);
        socket.close();
        serverSocket.close();
    }

    private static void testSocket() throws IOException {
        Socket socket = new Socket("182.89.192.57", 3306);
        OutputStream outputStream = socket.getOutputStream();
        outputStream.write("hello".getBytes());
        socket.close();

    }

    private static void test1() throws IOException {
//        InetAddress localHost = InetAddress.getLocalHost();
        InetAddress localHost = InetAddress.getByName("www.atguigu.com");
        System.out.println(localHost);
        System.out.println(localHost.getHostAddress());
        System.out.println(localHost.getHostName());
        System.out.println(localHost.isReachable(3000));
    }
}
