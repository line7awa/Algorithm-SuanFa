package com.linjh.dome240712;

public class test1 {


    public void testDanLi(){

    }

    public String longestCommonPrefix(String[] strs) {

        if (strs.length == 1) {
            return strs[0];
        }

        String str = strs[0];
        String str1 = strs[1];

        StringBuilder temp = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            if (i > (str1.length() - 1) || str.charAt(i) != str1.charAt(i)) {
                break;
            }
            temp.append(str.charAt(i));
        }
        String tempStr = temp.toString();
        if (temp.toString().length() == 0 ) {
            return "";
        } else {
            for (int i = 2; i < strs.length; i++) {
                if (tempStr.length() > strs[i].length()) {
                    tempStr = tempStr.substring(0, strs[i].length());
                }
                if (!strs[i].substring(0, tempStr.length()).equals(tempStr)) {
                    tempStr = tempStr.substring(0, tempStr.length() - 1);
                    i--;
                    if (tempStr.length() == 0) {
                        break;
                    }
                }
            }
        }
        return tempStr;
    }
}
