class Solution {
    public int[] replaceElements(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0; i<n; i++) {
            int max_el = 0;
            for(int j=i+1; j<n; j++){
                max_el = Math.max(max_el,arr[j]);
            }
            if(max_el == 0){
                list.add(-1);
            }
            else{
                list.add(max_el);
            }
        }
        int length_list = list.size();
        int newarr [] = new int[length_list];
        for(int i=0;i<length_list;i++){
            newarr[i] = list.get(i);
        }
        return newarr;
    }
}