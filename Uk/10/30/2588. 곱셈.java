import java.util.*;
public class Main {
    
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();
        int second = sc.nextInt();
        
        String[] arr = String.valueOf(second).split("");
        int a = first * Integer.parseInt(arr[2]);
        int b = first * Integer.parseInt(arr[1]);
        int c = first * Integer.parseInt(arr[0]);
        int d = a + b * 10 + c * 100;
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
	}

}
