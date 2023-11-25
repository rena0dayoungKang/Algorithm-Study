import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = new String[2];

       String input = br.readLine();
       arr= input.split(" ");
            
        for(int i=0; i<2; i++){
            StringBuilder sb = new StringBuilder(arr[i]);
            arr[i] = sb.reverse().toString(); //Builder의 reverse메서드는 객체를 생성시 뒤집어 주는게 아님 
                                              // 그리고 String type으로 반환하기 위해 .toString()잊지말기
        }

        Arrays.sort(arr);
        System.out.println(arr[arr.length - 1]);
    }
}
