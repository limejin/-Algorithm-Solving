class Solution {
    public String solution(String s) {
        String[] str_arr=s.split(" ");
        int[] num_arr=new int[str_arr.length];
        
        for(int i=0;i<str_arr.length;i++){
            num_arr[i]=Integer.parseInt(str_arr[i]);
        }
        
        int min=num_arr[0];
        int max=num_arr[0];
        
        for(int i=0;i<num_arr.length;i++){
            if(min>num_arr[i]) min=num_arr[i];
            if(max<num_arr[i]) max=num_arr[i];
        }
        
        String answer = "";
        answer+=min+" "+max;
        
        return answer;
    }
}