static void reversecharacter(char []s ,int i ,int j){
while(i<j){
 char temp=s[i];
  s[i]=s[j];
  s[j]=temp;
  i++;
  j--;
  } 
}

static String reverseWord(String s){
  char[] c = s.toCharArray();
  int start=0;
  int end=0;
  for(;end<s.length();end++){
    if(c[end]==' '){
    revesecharacter(c,start,end-1);
    start=end+1;
    }
  }
}


//method 2
public class MyClass {
public static String reverseWordWise(String input) {
int end = input.length();
int i = input.length() - 1;
String output = "";
while (i >= 0) {
if (input.charAt(i) == ' ') {
output = output + input.substring(i + 1, end) + " ";
end = i;
}
i--;
}
output += input.substring(i + 1, end);
return output;
}
}
