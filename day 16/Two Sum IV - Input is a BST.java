class Solution {
public:

vector<int> v;

void inorder(TreeNode* root)
{
    if(root == NULL)
        return;
    
    inorder(root->left);
    v.push_back(root->val);
    inorder(root->right);
}

bool findTarget(TreeNode* root, int k) {
    
    inorder(root);
    
    int st = 0 , end = v.size()-1;
    
    while(st < end)
    {
        if(v[st] + v[end] == k)
            return true;
        else if(v[st] + v[end] > k)
            end--;
        else
            st++;
    }
    
    return false;
}
};
