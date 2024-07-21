package com.linjh.dome240721;

import com.linjh.dome240717.TreeNode;

public class test2 {


    public int minDepth(TreeNode root) {

        return deepTree(root);
    }

    public int deepTree(TreeNode tree) {

        if (tree == null) {
            return 0;
        }
        int deepleft = deepTree(tree.left);
        int deepright = deepTree(tree.right);

        if (deepleft == 0 && deepright != 0) {
            return deepright + 1;
        } else if (deepright == 0 && deepleft != 0) {
            return deepleft + 1;
        } else {
            return Math.min(deepleft, deepright) + 1;
        }
    }
}
