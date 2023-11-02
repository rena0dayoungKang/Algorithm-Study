import java.util.*;

public class Main{
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        int c = sc.nextInt();
        
          h = (((h*60)+m+c)/60)%24;
          m = (m+c)%60;
        
        System.out.print(h+" "+m);
            
    }
}
