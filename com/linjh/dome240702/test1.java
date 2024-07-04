package com.linjh.dome240702;

import org.junit.Test;

public class test1 {

    int test;

    public int testIntJudge() {
        return this.test;
    }

    @Test
    public void resultTest(){
        String test = "III";
        int i = romanToInt(test);
        System.out.println(i);
    }

    public int romanToInt(String s) {
        char[] chars = s.toCharArray();
        int resultSum = changeRomanInt(chars[0]);
        for (int i = 1; i < chars.length; i++) {
            resultSum = resultSum + changeRomanInt(chars[i]);
            if (chars[i] == 'V' && chars[i - 1] == 'I') {
                resultSum = resultSum - 2 * changeRomanInt(chars[i - 1]);
            } else if (chars[i] == 'X' && chars[i - 1] == 'I') {
                resultSum = resultSum - 2 * changeRomanInt(chars[i - 1]);
            } else if (chars[i] == 'L' && chars[i - 1] == 'X') {
                resultSum = resultSum - 2 * changeRomanInt(chars[i - 1]);
            } else if (chars[i] == 'C' && chars[i - 1] == 'X') {
                resultSum = resultSum - 2 * changeRomanInt(chars[i - 1]);
            } else if (chars[i] == 'D' && chars[i - 1] == 'C') {
                resultSum = resultSum - 2 * changeRomanInt(chars[i - 1]);
            } else if (chars[i] == 'M' && chars[i - 1] == 'C') {
                resultSum = resultSum - 2 * changeRomanInt(chars[i - 1]);
            }
        }
        return resultSum;
    }

    public int changeRomanInt(char one) {
        int resultInt = 0;
        switch (one) {
            case 'I':
                resultInt = 1;
                break;
            case 'V':
                resultInt = 5;
                break;
            case 'X':
                resultInt = 10;
                break;
            case 'L':
                resultInt = 50;
                break;
            case 'C':
                resultInt = 100;
                break;
            case 'D':
                resultInt = 500;
                break;
            case 'M':
                resultInt = 1000;
                break;
        }
        return resultInt;
    }
}
