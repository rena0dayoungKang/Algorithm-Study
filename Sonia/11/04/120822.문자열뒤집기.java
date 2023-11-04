class Solution {
    public String solution(String my_string) {
        String answer = "";
        System.out.println(my_string.charAt(0));
   
        for(int i=my_string.length()-1;i>=0; i--) {
             answer+=my_string.charAt(i);
        }

        return answer;
    }
}

/*
+ 연산 방법은 낭비가 심함! 메모리를 위해서 사용해야하는 방법!!
class Solution {
    public String solution(String my_string) {
        String answer = "";
    
        //StringBuffer sbf = new StringBufffer(my_string);
        StringBuilder sb = new StringBuilder(my_string);
        //answer=sbf.reverse().toString();  //reverse() 메서드를사용
        answer= sb.reverse().toString();    
        
        return answer;
    }
}
*/
