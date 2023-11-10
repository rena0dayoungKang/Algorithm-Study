import java.util.*;
public class Main {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int[] arr = new int[n];  //배열값 0으로 초기화됨
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
             
            for(int j=a-1; j<b; j++) { // 처음 틀렸을 때, index를 생각 못하고 a로 시작했었음 주의하기!
                 arr[j] = c;
             }
                 }
             for(int i=0; i<n; i++) {
                     System.out.println(arr[i]); //0으로초기화 되어있었기 때문에 공이 들어있지 않은 바구니는 0을 출력하게됨
                 }
             }    
    
    }
    
