import java.util.*;
public class Main {
    public static void main (String[]args) {
        
      
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); // 바구니 수 1~5번
        int [] arr = new int [m];
        for(int i=0; i<m; i++) {
            arr[i] = i+1; //배열에 1~5 담기 
        }
        int n =sc.nextInt(); // 역순횟수
        
        for(int i=0; i<n; i++) {
            int x = sc.nextInt()-1; //범위를 정하는 숫자 입력
            int y = sc.nextInt()-1;
            
            for(int j=x; j<=y; j++){  //y->x역순으로 가야함 

                int temp = arr[x];  //y->x역순으로 가야함 
                arr[x]= arr[y];
                arr[y] =temp;
			           x++;
								 y--;  
              /* 이렇게 줄일 수 있다.
                int temp = arr[x];
                arr[x++]= arr[y];
                arr[y--] = temp;
            */
            }
            
        }
        for(int i=0; i<m; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
