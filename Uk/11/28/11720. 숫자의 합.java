import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str = sc.next();
        String[] arr = str.split("");
        int[] arr2 = new int[n];
        int answer = 0;
        for(int i = 0; i < arr.length; i++){
            arr2[i] = Integer.parseInt(arr[i]);
        }
        for(int i = 0; i < arr.length; i++){
            answer += arr2[i];
        }
        System.out.println(answer);
        sc.close();
    }
}
