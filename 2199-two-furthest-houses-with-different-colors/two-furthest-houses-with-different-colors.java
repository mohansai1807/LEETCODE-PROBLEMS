// class Solution {
//     public int maxDistance(int[] colors) {
//         int max_distance = 0;
//         int n = colors.length;
//         for(int i=0;i<n;i++){
//             for(int j=0;j<n;j++){
//                 int a = colors[i];
//                 int b = colors[j];
//                 if(a!=b){
//                     int distance = Math.abs(i-j);
//                     max_distance = Math.max(max_distance,distance);
//                 }
//             }
//         }
//         return max_distance;
//     }
// }

class Solution {
    public int maxDistance(int []colors) {
        int ans = 0;
        int n = colors.length; 
        int first = colors[0];
        int first_index = 0;
        int last_index = n-1;
        int last = colors[n-1];
        for(int i=n-1;i>=0;i--){
            int a = colors[i];
            if(first != a){
                int temp = Math.abs(i-first_index);
                ans = Math.max(ans,temp);
                break;
            }
        }
        for(int i=0;i<n;i++){
            int b = colors[i];
            if(last != b){
                int temp = Math.abs(i-last_index);
                ans = Math.max(ans,temp);
                break;
            }
        }
        return ans;
    }
    
}