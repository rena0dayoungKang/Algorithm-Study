import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        int n = 1;
        for (int i = 0; i < 28; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);

        int missing1 = -1;
        int missing2 = -1;
        for (int i = 0; i < 28; i++) {
            if (arr[i] != n) {
                if (missing1 == -1) {
                    missing1 = n;
                } else {
                    missing2 = n;
                    break;
                }
                i--;
            }
            n++;
        }

        if (missing2 == -1) {
            missing2 = n;
        }

        System.out.println(missing1);
        System.out.println(missing2);

        sc.close();
    }
}
