import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        List<Integer> list1 = new ArrayList<>();
        for(int i=1;i<=n;i++) {
            list1.add(i);
        }
        for(int i=0; i < m; i++) {
            int a = sc.nextInt()-1;
            int b = sc.nextInt()-1;
            Collections.reverse(list1.subList(a, b+1));
        }
        Integer[] arr = list1.toArray(new Integer[n]);
        for(int i=0;i< n;i++) {
            System.out.print(arr[i]+" ");
        }        
        sc.close();       
    }                                     
}
