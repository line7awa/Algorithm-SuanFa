package com.linjh.dome240716;

import java.util.Arrays;

public class test1 {

    public void merge(int[] nums1, int m, int[] nums2, int n) {

        if (nums1.length == nums2.length) {
            for (int i = 0; i < nums2.length; i++) {
                nums1[i] = nums2[i];
            }
            return;
        }
        int temp = 0;
        for (int i = m; i < nums1.length; i++) {
            nums1[i] = nums2[temp];
            temp++;
        }
        Arrays.sort(nums1);
    }
}
