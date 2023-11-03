import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[]answer = new int[n];
        for(int i=0; i<n; i++){
            int num = sc.nextInt();
            answer[i] = num;
        }
        int k = sc.nextInt();
        int cnt=0;
        for(int i=0; i<answer.length;i++){
            if(answer[i]==k){
                cnt+=1;
            }
        }
        System.out.println(cnt);
    }
}
