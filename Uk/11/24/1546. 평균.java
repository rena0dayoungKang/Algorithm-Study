import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Float[] arr = new Float[n];
        Float sum = 0F;
        
        for(int i=0;i < n; i++) {
            Float a = sc.nextFloat();
            arr[i] = a;
        }
        Arrays.sort(arr);
        for(int i=0;i < n; i++) {
            sum += arr[i];
        }
        System.out.println(sum/arr[n-1]*100/n);
        sc.close();
    }
}
