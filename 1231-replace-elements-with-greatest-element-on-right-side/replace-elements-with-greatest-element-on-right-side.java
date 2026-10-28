// class Solution {
//     public int[] replaceElements(int[] arr) {
//         int n = arr.length;
//         ArrayList<Integer> list = new ArrayList<>();
//         for(int i=0; i<n; i++) {
//             int max_el = 0;
//             for(int j=i+1; j<n; j++){
//                 max_el = Math.max(max_el,arr[j]);
//             }
//             if(max_el == 0){
//                 list.add(-1);
//             }
//             else{
//                 list.add(max_el);
//             }
//         }
//         int length_list = list.size();
//         int newarr [] = new int[length_list];
//         for(int i=0;i<length_list;i++){
//             newarr[i] = list.get(i);
//         }
//         return newarr;
//     }
// }


class Solution {
    public int[] replaceElements(int []arr){
        int n = arr.length;
        int right_max = -1; 
        for(int i=n-1;i>=0;i--){
            int prev = arr[i];
            arr[i] = right_max;
            right_max = Math.max(right_max,prev);
        }

        return arr;
    }
}