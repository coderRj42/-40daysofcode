class Solution {
    public List<String> letterCasePermutation(String s) {
        
        return sets("",s);
    }
    List<String> sets(String p, String up){
        List<String> list = new ArrayList<>();
        if(up.isEmpty()){
            list.add(p);
            return list;
        }
        
        char ch = up.charAt(0);
        
        if((ch + '0'>= 'a'+'0' && ch+'0' <= 'z'+'0') || (ch + '0'>= 'A'+'0' && ch+'0' <= 'Z'+'0')){
            
            if((ch + '0'>= 'A'+'0' && ch+'0' <= 'Z'+'0')) ch=Character.toLowerCase(ch);
            list.addAll(sets(p+ch,up.substring(1)));
            ch=Character. toUpperCase(ch);
            list.addAll(sets(p+ch,up.substring(1)));
        }else{
            list.addAll(sets(p+ch,up.substring(1)));
        }
        
        return list;
        
    }
    
}
