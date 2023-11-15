import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        //int n = Integer.parseInt(br.readLine());
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for(int i=0; i<n; i++){
            //arr[i] =Integer.parseInt(br.readLine());
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int max = arr[arr.length-1];
    
        double sum =0;
        for(int i=0; i<n;i++){
            sum += arr[i]*100.0/max;
        }
       
            double avg = sum/n;
          System.out.printf("%.2f%n", avg);

    }
}
