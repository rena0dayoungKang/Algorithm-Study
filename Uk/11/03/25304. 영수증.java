import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int num = sc.nextInt();
        int culc = 0;       
        int answer = 0;
        
        for(int i = 1; i <= num; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            culc += a * b;
        }
        if(culc == total) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        
    }
}
