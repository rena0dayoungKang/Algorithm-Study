class Solution {
    public int[] solution(int num, int total) {
    int[] answer = new int[num];
    
    // 연속된 num개의 정수를 더해 total이 되는 첫 번째 정수 => 이걸 찾는게 중요!
    int start = total / num - (num - 1) / 2;
    
    // 배열에 값 할당
    for (int i = 0; i < num; i++) {
        answer[i] = start + i;
    }
    
    return answer;
}
}
