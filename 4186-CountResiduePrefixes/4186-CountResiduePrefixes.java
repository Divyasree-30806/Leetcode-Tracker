// Last updated: 7/9/2026, 3:07:26 PM
class Solution {
    public int residuePrefixes(String s) {
        boolean[] r=new boolean[26];
        int a=0, b=0;
      
        for(int i=0;i<s.length();i++){
            int d=s.charAt(i)-'a';
            if(!r[d]){
                r[d]=true;
                a++;
            }
            int t=i+1;
            if(a==t%3){
                b++;
            }
        }
        return b;
        
    }
}
        
    
