class Solution {
public:
int subtractProductAndSum(int n) {
int sum = 0,mul = 1;
while(n>0) {
int digits = n%10;
sum+=digits;
mul *=digits;
n/=10;
}
return mul-sum;
}
};
