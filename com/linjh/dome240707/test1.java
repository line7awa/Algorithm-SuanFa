package com.linjh.dome240707;

import org.junit.Test;

public class test1 {


    @Test
    public void testremove() {
        int[] arrayTest = new int[]{0,1,2,2,3,0,4,2};

        removeElement(arrayTest , 2);
    }

    public int removeElement(int[] nums, int val) {
        int result = 0;
        if ((nums.length == 1 && nums[0] == val) || nums.length == 0) {
            return 0;
        }


        int mark = nums.length - 1;
        label: for (int i = 0; i < nums.length; i++) {
            result++;
            if (mark < i ) {
                break;
            }
            if (nums[i] == val) {
                while (nums[mark] == val ) {
                    mark--;
                    if (mark <= i) {
                        break label;
                    }
                }
                nums[mark] = nums[i] - nums[mark] + (nums[i] = nums[mark]);
                mark--;
            }
        }
        if (nums[result- 1] == val) {
            return result - 1;
        }else {
            return result;
        }
    }
}
