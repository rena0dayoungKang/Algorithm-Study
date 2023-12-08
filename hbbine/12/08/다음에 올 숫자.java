import java.util.*;

class Solution {
    public int solution(int[] common) {
        int answer = 0;
        
        //등차와 등비의 차이점은 두번째 원소와 세번제 원소가 나누어 떨어지는가에 있음 
        //배열 첫번째와 두번째 차 알기
        int first = common[1] - common[0]; 
        int second = common[2] - common[1];
        
        //나누어떨어지면 등비수열이므로 둘이 같으면 등차수열
       if(first == second){
         answer = common[common.length - 1] + first;
       }else if(common[0] != 0 && second % first == 0){
         int val = second / first;
         answer = common[common.length - 1] * val;
       }
          return answer;
      }
  }
