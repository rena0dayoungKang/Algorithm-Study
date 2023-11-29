import java.util.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] chess ={1,1,2,2,2,8}; //킹 1개, 퀸 1개, 룩 2개, 비숍 2개, 나이트 2개, 폰 8개
        int [] input = new int[6];
        int [] answer =new int[6];
        for(int i=0; i<6; i++){
            input[i] = sc.nextInt();
        }
        
        for(int i=0; i<chess.length; i++) {
            answer[i] = chess[i]-input[i];
            System.out.print(answer[i]+" ");
        }
      
    }
}
