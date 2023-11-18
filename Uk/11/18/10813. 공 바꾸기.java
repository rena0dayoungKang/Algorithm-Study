import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int[] basket = new int[num];
        for(int i=0;i<num;i++) {
        	basket[i] = i+1;
        }
        int n = sc.nextInt();
        for(int i=0;i<n;i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int tmp = 0;
            tmp = basket[a-1];
            basket[a-1] = basket[b-1];
            basket[b-1] = tmp;
        }
        for(int i=0;i<basket.length;i++) {
            System.out.print(basket[i]+" ");
        }
        sc.close();
    }
}
