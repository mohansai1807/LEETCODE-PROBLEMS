class Solution {
    public String simplifyPath(String path) {
        path = path.replaceAll("/+","/");
        Stack<String> stack = new Stack<>();
        String[] strs = path.split("/");
        // System.out.println(Arrays.toString(strs));
        for(String str : strs){
            if(!str.isEmpty()){
                if(str.equals("..")){
                    if(!stack.isEmpty()){
                        stack.pop();
                    }
                }else{
                    if(!str.equals(".")){
                        stack.push(str);
                    }
                }
            }
        }
        // System.out.println(stack);
        if(stack.isEmpty()){
            return "/";
        }
        StringBuilder sb = new StringBuilder();
        for(String str : stack){
            sb.append("/").append(str);
        }
        return sb.toString();
    }
}