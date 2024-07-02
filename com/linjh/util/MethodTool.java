package com.linjh.util;

import java.util.Random;

public class MethodTool {

    /**
     *@author: junhang
     *@createtime: 2024/6/29 16:00
     *@description: 生成长度为1000的数组
     *
     **/
    public static int[] unSortArrays(int size, int min, int max) {
        Random random = new Random();
        int[] array = new int[size];

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt((max - min) + 1) + min;
        }
        return array;
    }

    /**
     *@author: junhang
     *@createtime: 2024/7/1 22:49
     *@description: 定义随机字符串
     **/
    public static String getRandomString(int size , Boolean isPalindrome) {
        StringBuffer stringBuffer = new StringBuffer();
        char[] resultArray = new char[size];
        if (size == 0) {
            return "";
        }
        if (!isPalindrome) {
            if (size == 1) {
                return null;
            }
            for (int i = 0; i < size; i++) {
                resultArray[i] = generateRandomLetter();
            }
        } else {
            for (int i = 0; i < size / 2 + 1; i++) {
                int j = size - i - 1;
                char c = generateRandomLetter();
                resultArray[i] = c;
                resultArray[j] = resultArray[i];
            }
        }
        return stringBuffer.append(resultArray).toString();
    }

    /**
     *@author: junhang
     *@createtime: 2024/7/1 22:58
     *@description: 用来生成26个字母大小中的一个
     **/
    public static char generateRandomLetter() {
        Random random = new Random();
        // Randomly choose to generate a lowercase or uppercase letter
        boolean upperCase = random.nextBoolean();
        char letter;

        if (upperCase) {
            letter = (char) ('A' + random.nextInt(26));
        } else {
            letter = (char) ('a' + random.nextInt(26));
        }

        return letter;
    }
}
