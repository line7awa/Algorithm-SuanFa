package com.linjh.dome240717;


public class test1 {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        boolean sameTree = true;
        if (p == null && q != null) {
            return false;
        }
        if (p != null && q == null) {
            return false;
        }
        if (p == null && q == null) {
            return true;
        }
        if (p.val == q.val) {
            sameTree = isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        } else {
            return false;
        }
        return sameTree;
    }
}
