class Solution {
    public int divide(int n1, int n2) {

        
         if(n1==0){
      return 0;
    }
    if(n2==1){
      return n1;
    }

    if(n1==Integer.MIN_VALUE){
      if(n2==-1){
        return Integer.MAX_VALUE;
      }
    }
    return n1/n2;
  }

}
