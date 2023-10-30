class Solution {
    public String[] solution(String[] todo_list, boolean[] finished) {
        
        //true false 배열 설정
        int[] num = new int [finished.length];
        
        //false의 숫자세기
        int count = 0;
        
        //true false 분리
        for(int i = 0; i < finished.length; i++ ){
                if(finished[i]){
                    num[i] = 0;
                }else{
                    num[i] = 1;
                    count++;
                }
        }
        
        //answer배열 만들기
        String[] answer = new String[count];
        
        //todo list
        for(int i = 0, j = 0; i < todo_list.length; i++){
            if(num[i] == 1){
                answer[j] = todo_list[i];
                j++;
            }
        }
        
        return answer;
    }
}
