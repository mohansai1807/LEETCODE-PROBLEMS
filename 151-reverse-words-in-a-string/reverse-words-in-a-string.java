class Solution {
    public String reverseWords(String s) {
        String input[] = s.trim().split("\\s+");
        int n = input.length;
        String result = "";
        for(int i=n-1;i>=0;i--){
            result = result + input[i];
            if(i!=0){
                result = result + " ";
            }
        }
        return result;
    }
}