import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[9];
        for(int i=0;i<9;i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr2 = arr.clone();
        Arrays.sort(arr);
        for(int i=0;i<9;i++){
            if(arr2[i] == arr[8]){
                System.out.println(arr[8]);
                System.out.println(i+1);
            }
        }
        sc.close();
    }
}
