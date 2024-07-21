package com.linjh.dome240721;

import com.linjh.dome240717.TreeNode;

public class test1 {

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return false;
        }

        int i = deepTree(root.left);
        int i1 = deepTree(root.right);

        return Math.abs(i - i1) <= 1 && i != Integer.MAX_VALUE && i1 != Integer.MAX_VALUE;
    }

    public int deepTree(TreeNode tree) {

        if (tree == null) {
            return 0;
        }
        int deepleft = deepTree(tree.left);
        int deepright = deepTree(tree.right);
        if (deepleft == Integer.MAX_VALUE || deepright == Integer.MAX_VALUE) {
            return Integer.MAX_VALUE;
        }
        int dsp = Math.abs(deepright - deepleft);
        if ( dsp > 1) {
            return Integer.MAX_VALUE;
        } else {
            return Math.max(deepleft, deepright) + 1;
        }
    }
}
