package com.linjh.dome240706;

import java.util.Collection;

public class test1 {

    public int searchInsert(int[] nums, int target) {

        int result = nums.length;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] >= target) {

                result = i;
                break;
            }
        }


        return result;
    }
}
