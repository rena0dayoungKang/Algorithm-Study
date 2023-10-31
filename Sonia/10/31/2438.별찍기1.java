import java.util.*;

public class Main{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=0; i<n; i++){ //줄바꿈 
            for(int j=0; j<=i; j++){  //별찍기
               
            	System.out.print("*");
                
            }
            System.out.print("\n");
        }
    }
}
