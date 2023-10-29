import java.util.*;
public class Main {
    
  public static void main(String args[]) {
    //알람시계(45분 빠른 시계 설정)    
    Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int M = sc.nextInt();
          
         
            if((H>=0 && H<=23)&&(M>=0&&M<=59)) {
            	M = M+60-45;
            if(M%60==0){
            	M=0;
                System.out.println(H+" "+M);
            }else if(M>60) {
                M=M%60;
                System.out.println(H+" "+M);
            }else if(M<60 && H!=0) {
                H=H-1;  
                System.out.println(H+" "+M);
            }else if(M<60 && H==0) {
                H=23;   
                System.out.println(H+" "+M);
            }
        }
    }
    
}
