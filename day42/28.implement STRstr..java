class Solution {
public static int strStr(String haystack, String needle) {
	 int ans = 0;
	 // testing the boundary condition: 
	 if(needle == null || needle == "") {
		 ans = 0;
	 }
	 else if(haystack.contains(needle)) {	 
		 ans = haystack.indexOf(needle);
	 }
	 else {
		 ans = -1;
	 }
	 return ans;  
}
}
