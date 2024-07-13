package com.linjh.dome240713;

public class test1 {

    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
                if (i == 0) {
                    int[] newDigits = new int[digits.length + 1];
                    newDigits[0] = 1;
                    digits = newDigits;
                }
            } else {
                digits[i] += 1;
                break;
            }
        }
        return digits;
    }

}
