import java.util.*;
public class Main{
    public static void main(String args[]) {
      
        Scanner sc = new Scanner(System.in);
        

        int x = sc.nextInt(); 
        int n = sc.nextInt();
        
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            x = x-(a*b);
        }
        if(x == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
/*
런타임에러 
import java.io.*;
public class Main{
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        //BufferedReader는 String 으로만 읽고 가져옴
        int x = Integer.parseInt(br.readLine()); // 숫자형으로 형변환하여 입력받기
        int n = Integer.parseInt(br.readLine());
        int answer = 0;
        for(int i=0; i<n; i++){
            int a = Integer.parseInt(br.readLine());
            int b = Integer.parseInt(br.readLine());
            x = x-(a*b);
        }
        if(x == 0){
            System.out.println("Yes");
        }else{
            System.out.println("No");
        }
        
    }
}
*/
