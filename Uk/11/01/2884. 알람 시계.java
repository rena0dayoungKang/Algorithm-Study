import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        
        if (b < 45){
            a -= 1;
            b = b+60-45;
            if (a < 0){
                a = 23;
            }
        } else {
            b -= 45;
        }

        System.out.println(a + " " + b);       
    }
}
