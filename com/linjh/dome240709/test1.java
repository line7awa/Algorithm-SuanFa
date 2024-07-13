package com.linjh.dome240709;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class test1 {

    public static void main(String[] args) {
            String[] fileNames = {"file1.txt", "file2.txt", "file3.txt"};

            for (String fileName : fileNames) {
                Thread thread = new Thread(new FileProcessor(fileName));
                thread.start();
            }
        }
    }

    class FileProcessor implements Runnable {
        private String fileName;

        public FileProcessor(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
                String line;
                while ((line = br.readLine()) != null) {
                    // 模拟处理文件内容
                    System.out.println("Processing " + fileName + ": " + line);
                    Thread.sleep(100); // 模拟处理时间
                }
            } catch (IOException | InterruptedException e) {
                e.printStackTrace();
            }
        }
}
