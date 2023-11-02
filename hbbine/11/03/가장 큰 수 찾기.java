class Solution {
    public int[] solution(int[] array) {
        
        //가장큰수, 인덱스 -> 크기 설정
        int[] answer = new int[2];
        
        //변수 설정
        int num = Integer.MIN_VALUE;
        int cnt = 0;
        
        //반복문 돌려서 찾기
        for(int i= 0 ; i <  array.length; i++){
            if(array[i] > num){
                num = array[i];
                answer[0] = num;
                answer[1] = cnt; 
            }
            cnt++;
        }
        
        return answer;
    }
}
