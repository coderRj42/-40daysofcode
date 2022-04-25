class Solution {
public:
    int finalValueAfterOperations(vector<string>& operations) {
        int j=0;
        for(string i:operations){
            if(i=="--X" || i=="X--") j--;
            else j++;
        }
        return j;
    }
};
