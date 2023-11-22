import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); // 숫자 입력
        
        for(int i=0; i<num; i++) {
            //NumberFormat Exception 숫자가 1 2 형태가 아니라 줄바꿈으로 입력 받게될 때 생기는 문제 발생 
            String[] arr =br.readLine().split(" "); // 따라서 입력을 받고 공백으로 구분 해줌 StringTokenizer로 받으면 해결 될듯.. 
            int n = Integer.parseInt(arr[0]);  
            String text = arr[1];               
            StringBuilder sb = new StringBuilder();
         
            for(int j=0; j<text.length(); j++){
                for(int k=0; k<n; k++){
                      sb.append(text.charAt(j));
                }
            }  
              System.out.println(sb);
        }    
    }
}
