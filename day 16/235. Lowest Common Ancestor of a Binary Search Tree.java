class Solution {
public:
    TreeNode* lowestCommonAncestor(TreeNode* root, TreeNode* p, TreeNode* q) {
        
        while(root)
        {
            if((root->left == p && root->right == q )|| (root->left == q && root->right == p) ) 
            {
                break;
            }
            if(root == p &&(root->left == q || root->right == q)) break;
            
            if(root == q &&(root->left == p || root->right == p)) break;
            if(p->val < root->val && q->val < root->val)
            {
                 root = root->left;
            }
            else if(p->val > root->val && q->val > root->val)
            {
                root = root->right;
            }
            else
            {
                
                break;
            }
        }
        
        return root;
        
    }
};
