import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++) {
            String str = sc.next();
            String[] arr = str.split("");
            System.out.println(arr[0]+arr[arr.length-1]);
        }
        sc.close();
    }
}
