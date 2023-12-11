class Solution {
    public String solution(String[] id_pw, String[][] db) {
        //answer값 fail 기본값 지정
        String answer = "fail";
        
        //먼저 로그인정보 담긴 배열 반복해서 돌기
        for(int i = 0; i < db.length; i++){ 
            //아이디 일치여부
            if(db[i][0].equals(id_pw[0])){
                //비밀번호 일치여부
                if(db[i][1].equals(id_pw[1])){
                    answer = "login";
                }else{
                    answer = "wrong pw";
                }
                break;
            }
        }
    return answer;
    }
}
