class Solution {
      public TreeNode invertTree(TreeNode root) {
        if(root == null) return root;
        
        TreeNode leftCache = root.left;
        root.left = invertTree(root.right);
        root.right = invertTree(leftCache);
        
        return root;
    }
}
