import java.util.*;

class Solution {
    public int solution(int num, int k) {
        
        //먼저 num문자형으로 바꿔서 split쓰기
        String num1 = Integer.toString(num);
        
        //num1 배열에 넣기
        String[] arr = num1.split("");
        
        //반복문으로 k찾기
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(Integer.toString(k))){
                return i + 1;
            }     
        }
        return -1;
    }
}
