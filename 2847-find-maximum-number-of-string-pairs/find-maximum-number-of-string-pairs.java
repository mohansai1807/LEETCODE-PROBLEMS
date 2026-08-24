class Solution {
    public String helper(String value1){
        String check = "";
        for(int k=value1.length()-1;k>=0;k--){
            check = check + value1.charAt(k);
        }
        return check;
    }
    public int maximumNumberOfStringPairs(String[] words) {
        int count = 0;
        int n = words.length;
        for(int i=0;i<n;i++){
            String value1 = words[i];
            String check = helper(value1);
            for(int j=i+1;j<n;j++){
                String value2 = words[j];
                if(check.equals(value2)){
                    count++;
                }
            }
        }
        return count;
    }
}