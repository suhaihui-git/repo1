package com.suhaihui.ui;

import java.io.*;

public class Io_test {
    public static void main(String[] args) throws IOException {
        //File.separator 以当前系统的分隔方式进行分隔 windows:\    linux:/
        String filename = "D:" + File.separator + "hello.txt";
        File file = new File(filename);
        FileInputStream fileReader = new FileInputStream(file);
        //设置读取编码格式为gbk，否则会出现乱码
        InputStreamReader inputStreamReader = new InputStreamReader(fileReader,"GBK");
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        //简写
//     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file),"GBK"));
        String len;
//        readLine：按行读取，只能用于缓冲流
        while ((len= bufferedReader.readLine()) != null){
            System.out.println(len);
        }

        inputStreamReader.close();
        fileReader.close();
        bufferedReader.close();
    }
}
