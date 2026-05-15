class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder res = new StringBuilder();
        int cnt=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == ')'){
                cnt--;
            }

            if(cnt != 0){
                res.append(s.charAt(i));
            }

            if(s.charAt(i) == '('){
                cnt++;
            }
        } 
        return res.toString();
    }
}