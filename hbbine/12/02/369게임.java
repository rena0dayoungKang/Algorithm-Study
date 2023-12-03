class Solution {
    public int solution(int order) {
        
        //order풀어서 배열로 ㄱ
        String[] str = Integer.toString(order).split("");
        
        //반복문 돌려서 369찾고 박수 세기
        int clap = 0;
        for(int i = 0; i < str.length; i++){
            if(str[i].equals("3")| str[i].equals("6")| str[i].equals("9")){
                clap ++;
            }
        }
        
        return clap;
    }
}
