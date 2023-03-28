class Solution {
    public String solution(String s) {
        char[] sarray=s.toCharArray();
        String tempString="";
        String answer = "";
        
        for(int i=0;i<sarray.length;i++){
            if(sarray[i]!=' '){
                
                if(tempString.length()==0){
                    tempString+=String.valueOf(sarray[i]).toUpperCase();
                }else{
                    tempString+=String.valueOf(sarray[i]).toLowerCase();
                }
                
                if(i==sarray.length-1){
                    if(tempString.length()!=0){
                        answer+=tempString;
                    }
                }
            }else{
                // if(tempString.length()!=0){
                //     answer+=tempString+" ";
                //     tempString="";
                // }   
                  
                if(tempString.length()!=0){
                    answer+=tempString+" ";
                    tempString="";
                }else{
                    answer+=" ";
                }
                
            }
        }
        return answer;
    }
}