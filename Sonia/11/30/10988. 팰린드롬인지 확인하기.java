import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
       
      
        String text = br.readLine(); 
        StringBuilder sb = new StringBuilder(text); //.reverse() 사용하기 위함  객체를 먼저 생성해줘야함 ....!
        String check = sb.reverse().toString();  // String으로 바꿔줘야함
        
        if(text.equals(check)) {
            System.out.println(1);
        }else {
             System.out.println(0);
        }
    }
}
