package com.linjh.dome240708;

import org.junit.Test;

public class TestLeetcode {

    @Test
    public void test1() {
        int hello_world = lengthOfLastWord("Hello World");

        System.out.println(hello_world);
    }


    public int lengthOfLastWord(String s) {

        int left = 0;
        int right = s.length() - 1;
        for (int i = right; i >= 0; i--) {
            if (s.charAt(i) != ' ') {
                right = i;
                break;
            }
        }

        for (int i = right; i >= 0; i--) {
            if (s.charAt(i) == ' ') {
                left = i;
                break;
            }
        }

        return right - left;
    }
}
