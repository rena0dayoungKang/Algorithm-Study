class Solution {
    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int[] answer = new int[2];
        int a = denom1;
        int b = denom2;
        int Max = findGCD(a,b);
        int Min = (a * b) / Max;
        
        //분모더하기( = 최소공배수)
        int Mother = Min;
        
        //분자 더하기((최소 공배수 / 분모) * 분자)
        int Son1 = (Min / denom1) * numer1;
        int Son2 = (Min / denom2) * numer2;
        int TotalSon = Son1 + Son2;
        
        //최종 분모/분자가 약분이 될 경우 예외처리 => 이거 중요!
        int againGCD = findGCD(TotalSon, Mother);
        if (againGCD > 1) {
            // 약분이 가능한 경우 분자와 분모를 약분
            TotalSon /= againGCD;
            Mother /= againGCD;
        }
        //배열에 넣기
        answer[0] = TotalSon;
        answer[1] = Mother;
        
        return answer;
    }
    
    //최대공약수
    public static int findGCD(int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}
