import java.util.*;

public class Main {
    public static void main(String[]args){
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String [] arr = new String[n];
        String numbers = sc.next(); 
        arr=numbers.split("");
        
        int sum = 0;
        for(String i:arr){
            sum+=Integer.parseInt(i);
        }
        System.out.println(sum);
    }
}

/*
char[] 배열로도 활용 가능 .toCharArray(str)로 저장 
Charater.getNumericValue(char) 숫자형태의 char를 int형으로 형변환 하여 문제 해결 
*/
