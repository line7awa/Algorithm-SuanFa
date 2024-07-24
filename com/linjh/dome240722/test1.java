package com.linjh.dome240722;

import com.linjh.dome240717.TreeNode;

import java.util.concurrent.CopyOnWriteArrayList;

public class test1 {

    public boolean hasPathSum(TreeNode root, int targetSum) {

        CopyOnWriteArrayList<Object> objects = new CopyOnWriteArrayList<>();


        if (root == null) {
            return false;
        }
        targetSum = targetSum - root.val;
        if (root.left == null && root.right == null) {
            if (targetSum == 0) {
                return true;
            } else {
                return false;
            }
        }

        return hasPathSum(root.left, targetSum) || hasPathSum(root.right, targetSum);
    }

}
