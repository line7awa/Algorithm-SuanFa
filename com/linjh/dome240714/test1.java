package com.linjh.dome240714;

import java.math.BigInteger;

public class test1 {

    public static void main(String[] args) {
        String s = Integer.toBinaryString(Integer.parseInt("1111111"));
        System.out.println(s);

        String s1 = Long.toBinaryString(Long.parseLong("11" , 2));
        System.out.println(s1);

    }

    public String addBinary(String a, String b) {

        StringBuilder result = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length() - 1;
        int carry = 0;

        while (i >= 0 || j >= 0) {
            int sum = carry;
            if (i >= 0) {
                sum += a.charAt(i) - '0';
                i--;
            }
            if (j >= 0) {
                sum += b.charAt(j) - '0';
                j--;
            }
            result.append(sum % 2);
            carry = sum / 2;
        }

        if (carry != 0) {
            result.append(carry);
        }

        return result.reverse().toString();
    }
}
