class Solution {
    
    void postOrder(TreeNode* node,vector<int> &ans){
        if(node == NULL){
            return;
        }
        postOrder(node->left,ans);
        postOrder(node->right,ans);
        ans.push_back(node->val);
    }
public:
    vector<int> postorderTraversal(TreeNode* root) {
        vector<int> ans;
        if(root == NULL) return ans;
        postOrder(root,ans);
        return ans;
    }
};
