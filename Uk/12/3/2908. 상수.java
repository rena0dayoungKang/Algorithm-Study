import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.next();
        String str2 = sc.next();
        String[] arr1 = str1.split("");
        String[] arr2 = str2.split("");
        int n1 = Integer.parseInt(arr1[2]) * 100 + Integer.parseInt(arr1[1]) * 10 + Integer.parseInt(arr1[0]);
        int n2 = Integer.parseInt(arr2[2]) * 100 + Integer.parseInt(arr2[1]) * 10 + Integer.parseInt(arr2[0]);
        System.out.println(Math.max(n1,n2));
        sc.close();            
    }
}
