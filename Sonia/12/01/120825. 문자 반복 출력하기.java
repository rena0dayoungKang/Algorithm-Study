//프로그래머스

import java.util.*;
class Solution {
    public String solution(String my_string, int n) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<my_string.length(); i++){
            for(int j=0; j<n; j++) {
                sb.append(my_string.charAt(i));
            }
        }
         answer = sb.toString();
        return answer;
    }
}
