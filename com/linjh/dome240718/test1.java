package com.linjh.dome240718;

import com.linjh.dome240717.TreeNode;

import java.util.ArrayDeque;

public class test1 {

    ArrayDeque<Integer> ad;

    public boolean isSymmetric(TreeNode root) {
        ad = new ArrayDeque<Integer>();

        leftDeep(root.left);
        rightDeep(root.right);
        if (ad.size() == 0) {
            return true;
        }

        return false;
    }

    public void leftDeep(TreeNode rootLeft) {

        if (rootLeft == null) {
            ad.addLast(-101);
            return;
        }

        if (rootLeft.right == null && rootLeft.left == null) {
            ad.addLast(rootLeft.val);
            return;
        }

        leftDeep(rootLeft.right);

        leftDeep(rootLeft.left);

        ad.addLast(rootLeft.val);

        return;

    }

    public void rightDeep(TreeNode rootRight) {

        if (rootRight == null) {

            Integer integer = ad.peekFirst();
            if (integer != -101) {
                return;
            } else {
                ad.pollFirst();
            }
            return;
        }

        if (rootRight.right == null && rootRight.left == null) {
            Integer integer = ad.peekFirst();
            if (integer == rootRight.val) {
                ad.pollFirst();
            }
            return;

        }

        rightDeep(rootRight.left);

        rightDeep(rootRight.right);


        Integer integer = ad.peekFirst();
        if (integer != rootRight.val) {
            return;
        } else {
            ad.pollFirst();
        }

        return;

    }

}
