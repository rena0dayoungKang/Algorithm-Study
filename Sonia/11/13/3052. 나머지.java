import java.io.*;
import java.util.*;
public class Main {
    public static void main (String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int [11]; //boolean..?
        HashSet<Integer> hs = new HashSet<>(); //중복값을 제거하기 위해선 Arraylist가 아니라 HashSet이용
        
        for(int i=0; i<10; i++) { //10번 숫자 입력
            int num = Integer.parseInt(br.readLine());
            arr[i] = num%42;
              hs.add(arr[i]); 
        }
         
        System.out.println(hs.size());
    }
}
