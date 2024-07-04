package com.linjh.dome240704;

import org.junit.Test;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

public class test1 {

    /**
     *@author: junhang
     *@createtime: 2024/7/4 20:50
     *@description: FileInputStream学习
     **/
    @Test
    public void IOTest() {

        try {
            FileInputStream fileInputStream = new FileInputStream("test.txt");

            byte[] bytes = new byte[1024];

            int readCount = 0;

            while ((readCount = fileInputStream.read(bytes)) != -1) {
                String s = new String(bytes, 0, readCount);
                System.out.println(s);
//                System.out.println;
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    /**
     *@author: junhang
     *@createtime: 2024/7/4 20:55
     *@description: FileOutputStream
     **/
    @Test
    public void outPutStreamTest() {
        FileOutputStream fileOutputStream = null;

        try {
            fileOutputStream = new FileOutputStream("OutPutStream.txt" );

            String s = "辜某涛，好好加油";

            byte[] bytes1 = s.getBytes(StandardCharsets.UTF_8);

            fileOutputStream.write(bytes1);
            fileOutputStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
