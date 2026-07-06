class Solution {
    public String reverseWords(String s) {
        int n=s.length();
        String res="";

        int i=n-1;

        while(i>=0){
            while(i>=0 && s.charAt(i)==' ') i--;

            int end=i;
            if(i<0) break;
            while(i>=0 && s.charAt(i)!=' '){
                i--;
            }
            String w = s.substring(i+1,end+1);

            if(res.length()==0){
                res += w;
            } 
            else res=res+" "+w;
        }
        return res.toString();
    }
}

      