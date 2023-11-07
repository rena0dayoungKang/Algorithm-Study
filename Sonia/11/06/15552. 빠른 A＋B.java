import java.io.*;
import java.util.*; 
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        int n = Integer.parseInt(br.readLine());
        for(int i=0; i<n; i++){
        StringTokenizer st = new StringTokenizer(br.readLine());
        int a =  Integer.parseInt(st.nextToken());
        int b =  Integer.parseInt(st.nextToken());
        bw.write(String.valueOf(a+b));
        bw.newLine();   
        }
      bw.flush();    
      bw.close();
    }
}
/*
또 다른 정답,그러나 소요 시간이 길다. 
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        //BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));  
        
        for(int i=0; i<n; i++){
        int a =  sc.nextInt();
        int b =  sc.nextInt();
         bw.write(String.valueOf(a+b));
         bw.newLine();  
        }
      bw.flush();    
      bw.close();
    }
}


*/
