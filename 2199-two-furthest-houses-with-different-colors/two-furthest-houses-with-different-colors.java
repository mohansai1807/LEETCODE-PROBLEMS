class Solution {
    public int maxDistance(int[] colors) {
        int max_distance = 0;
        int n = colors.length;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int a = colors[i];
                int b = colors[j];
                if(a!=b){
                    int distance = Math.abs(i-j);
                    max_distance = Math.max(max_distance,distance);
                }
            }
        }
        return max_distance;
    }
}