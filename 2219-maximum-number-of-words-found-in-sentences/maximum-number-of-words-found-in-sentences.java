class Solution {
    public int mostWordsFound(String[] sentences) {
        int ans = 0;
        int n = sentences.length;
        for(int i=0;i<n;i++){
            String value[] = sentences[i].split(" ");
            int count = value.length;
            ans = Math.max(ans,count);
        }
        return ans;
    }
}