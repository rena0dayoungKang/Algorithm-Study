import java.util.*;

public class Main{
    public static void main(String args[]) {
     Scanner sc = new Scanner(System.in);
        double A = sc.nextDouble();
        double B = sc.nextDouble(); // 실수엔 정수도 포함됨
        /*
        int A,B로 선언하고 double 로 형변환도 가능 int result = (double) A/B 
        */       
        
        System.out.println(A/B);
        
    }
}
