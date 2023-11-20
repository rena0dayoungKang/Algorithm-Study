import java.util.*;
public class Main {
    public static void main(String [] args) {
     Scanner sc = new Scanner(System.in);
        int[][]arr = new int[9][9]; //9*9 array
      for(int i=0; i<9; i++) {
          for(int j=0; j<9; j++){
              arr[i][j] = sc.nextInt();
          }
      }
         int max = Integer.MIN_VALUE; //정수 최소값 저장
         int a=0;
         int b=0;
        for(int i=0; i<9; i++) {
          for(int j=0; j<9; j++){
             max = Math.max(max,arr[i][j]); //if(arr[i][j]>max){max =arr[i][j];}
              if(arr[i][j]==max){   
               a = i+1;
               b = j+1;
              }
          }
        }
        System.out.println(max);
        System.out.print(a+" "+b);
    }
}
