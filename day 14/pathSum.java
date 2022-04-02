class Solution {
public boolean hasPathSum(TreeNode root, int targetSum) {

// if(targetSum<0)
// return false;

    if(root==null)
        return false;
    
    // if(targetSum==0 && root.left==null && root.right==null)
    //     return true;
    
    if(root.val==targetSum && root.left==null && root.right==null)
        return true;
    
    boolean a=false,b=false;
    
    if(root.left!=null)
      a=  hasPathSum(root.left, targetSum-root.val);
    
            if(root.right!=null)
      b=  hasPathSum(root.right, targetSum-root.val);
    
    return(a||b);
        
}
}
