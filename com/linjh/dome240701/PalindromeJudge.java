package com.linjh.dome240701;

import org.junit.Test;

import static com.linjh.util.MethodTool.getRandomString;

public class PalindromeJudge {


    @Test
    public void test1(){
        Boolean aBoolean = judgeIsPalindrome();
        System.out.println(aBoolean);

        StringBuffer stringBuffer = new StringBuffer();

    }

    public Boolean judgeIsPalindrome() {
        String randomString = getRandomString(1, true);

        System.out.println(randomString);
        int size = randomString.length();

        if (size == 1) {
            return true;
        }

        for (int i = 0; i < size  / 2 + 1; i++) {
            int j = size - i - 1;
            if (randomString.charAt(i) != randomString.charAt(j)) {
                return false;
            }
        }
        return true;

    }

}
