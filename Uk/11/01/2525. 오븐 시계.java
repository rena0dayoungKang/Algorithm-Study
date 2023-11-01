import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();   
        String[] arr = str.split(" ");
        Long a = Long.parseLong(arr[0]);
        Long b = Long.parseLong(arr[1]);
        Long num = sc.nextLong();
        Long total = a*60+b;
        total += num;
        Long h = (total/60) % 24;
        Long m = total%60;
        
        System.out.println(h+" "+m);
 
    }
}   
    
