class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int arr[] = new int[26];
        for(int i=0;i<s.length();i++){
            char s1 = s.charAt(i);
            char t1 = t.charAt(i);
            arr[s1-'a']++;
            arr[t1-'a']--;
        }

        for(int i : arr){
            if(i!=0) return false;
        }
        return true;
    }
}