package com.linjh.dome240705;

import org.junit.Test;

import java.util.*;

public class test1 {


    @Test
    public void testRemoveDuplicates() {
        int[] nums = new int[]{-3, -1, 0, 0, 0, 3, 3};

        removeDuplicates(nums);

        System.out.println(nums.length);
    }

    public int removeDuplicates(int[] nums) {

        int left = 0;
        for (int i = 0; i < nums.length; i++) {

            if (nums[i] != nums[left]) {

                nums[left + 1] = nums[i];
                left++;
            }

        }
        return left + 1;
    }
}
