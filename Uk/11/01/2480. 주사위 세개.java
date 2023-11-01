import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();   
        String[] arr = str.split(" ");
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        int c = Integer.parseInt(arr[2]);
        int money = 0;
        if (a == b && b == c) {
            money = 10000+1000*a;
        } else if (a==b || a==c){
            money = 1000+100*a;
        } else if (b==c){
            money = 1000+100*b;
        } else {
            int max = Math.max((Math.max(a,b)),c);
            money = max * 100;
        }
        System.out.println(money);
    }
}   
    
   
    


