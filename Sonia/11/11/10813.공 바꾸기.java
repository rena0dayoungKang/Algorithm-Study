import java.util.*;

public class Main {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(); //바구니 수 
        int[] arr = new int[m];
        int n = sc.nextInt(); //교환
        
        for(int i=0; i<m; i++){
            arr[i]= i+1;
        }
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int temp = arr[a-1];
            arr[a-1] = arr[b-1]; //바꾸기 전에 제대로 교환하기 위해 템프에 저장해줘야함... 여기서 arr[a-1]의 값이 바뀌기때문에
            arr[b-1] = temp;
        }
        for(int i=0; i<m; i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
