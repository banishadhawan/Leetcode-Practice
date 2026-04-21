class Solution {
    public int percentageLetter(String s, char letter) {
        int ans=0, count=0;
        int n=s.length();

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==letter){
                count++;
            }
        }
        ans = (count*100)/n;
        return ans;
    }
}
