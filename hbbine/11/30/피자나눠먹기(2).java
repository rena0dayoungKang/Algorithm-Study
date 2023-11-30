class Solution {
    public int solution(int n) {
        //피자 6과 사람 n의 최소공배수구하기
        int answer = 0;
        int a = 6;
        int b = n;
        answer = lcm(a,b) / 6;
    return answer ;
    }
    
    //최대공약수
    public int gcm (int a, int b){
        while(b != 0){
            int temp = b;
            b = a % b;
            a = temp;
        }
    return a;
    }
     //최소공배수  
     public int lcm(int a, int b){
         return (a * b) / gcm(a,b);
     }   
}
