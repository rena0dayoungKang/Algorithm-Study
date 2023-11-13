import java.io.*;

public class Main {
    public static void main(String [] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        boolean[] check = new boolean[31]; //1~30번 출석체크
        //int[]check = new int[31]; int형으로 찾아도 됨
        
        for(int i=0; i< 28; i++) { 
        int num = Integer.parseInt(br.readLine()); //28번 번호 입력
        check[num - 1] = true; //출첵 완, 번호는 1-30번이고 인덱스니까 -1 해줌
        }
        
        for(int i=0; i<30; i++){
            if(!check[i]) {  //false면
                System.out.println(i+1);
            }  
        }
        
        
    }
}
