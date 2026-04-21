class Solution {
    public String reverseWords(String s) {
       int n=s.length();

        String ans = "";

        int i=n-1;
        while(i>=0){
            while(i>=0 && s.charAt(i)==' '){
                i--;
            }

            int end=i;
            if(i<0) break;

            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String w = s.substring(i+1,end+1);

            if(ans.length()==0){
                ans=w;
            }
            else{
                ans = ans + " " + w;
            }
        }
        return ans;
    }
}
   