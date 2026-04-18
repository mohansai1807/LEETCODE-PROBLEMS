class Solution {
    public int lengthOfLastWord(String s) {
        String input[] = s.split(" ");
        ArrayList<String> list = new ArrayList<>();
        for(String i : input){
            if(i!=" "){
                list.add(i);
            }
        }
        int n = list.size();
        String value = list.get(n-1);
        return value.length();
    }
}