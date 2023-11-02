import java.util.*;
import java.io.*;
public class Main {
    public static void main(String args[])throws IOException{
        /*
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(bf.readLine()); //형변환 해줘야함
        */
        Scanner sc = new Scanner(System.in);
    
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int[]arr = {a,b,c};
      
        if(a==b&&a==c&&b==c) { //셋다 같은 경우
           System.out.println(10000+(a*1000));
        }else if(a==b && a!=c || a==c && a!=b) {
           System.out.println(1000+(a*100));
            
        }else if (b==c && b!=a){
          System.out.println(1000+(b*100));  
        }else if(a!=b&& a!=c && b!=c) {
            //int max = Math.min(); 처음에 이렇게 선언해서 틀렸음!! 기억하도록!
            int max = Integer.MIN_VALUE; 
            for(int i:arr) {
                 max = Math.max(max,i);
            }
             System.out.println(max*100);  
          
        }           
        
        
    }
    
}
