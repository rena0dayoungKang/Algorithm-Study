import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int [] arr = new int[9];
        int max = Integer.MIN_VALUE;
        int number = 0;
        for(int i=0; i<9; i++){
            int num = sc.nextInt();
            arr[i] = num;
             
            max = Math.max(max,arr[i]);
            if(max ==arr[i]){
                number =i+1;
            }
        }
          System.out.println(max);
        System.out.println(number);
        
        
    }
}
