class Solution {
    public String solution(int age) {
        String answer = "";
        
        //알파벳 배열로 만들기
        char[] alpabet = new char[26];
        for(int i = 0; i < alpabet.length; i++){
            alpabet[i] = (char)(97 + i);
        }
        
        //age따로 분리해서 배열과 비교
        String ageString = Integer.toString(age); // -> age를 문자로 변환
        char[] num = ageString.toCharArray(); // -> 문자로 변환된 age를 char배열로 변환
        
        //정답 담을 변수 설정
        StringBuilder sb = new StringBuilder();
        
        //반복문 돌리면서 정답 설정
        for(int i = 0; i < num.length; i++){
            int digit = Character.getNumericValue(num[i]);
            
           if(digit >= 0 && digit <= 25){
               sb.append(alpabet[digit]);
           }
        }
        
        answer = sb.toString();
        
        return answer;
    }
}
