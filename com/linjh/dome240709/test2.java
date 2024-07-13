package com.linjh.dome240709;

import java.util.HashMap;

public class test2 {


    public int strStr(String haystack, String needle) {
        int needleLength = needle.length();
        int result = -1;
        for (int i = 0; i < haystack.length() - needleLength; i++) {
            if (haystack.substring(i, i + needleLength).equals(needle)) {
                result = i;
                break;
            }
        }
        return result;
    }

}
