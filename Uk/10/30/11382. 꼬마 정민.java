import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] arr = str.split(" ");
        
        System.out.println(Long.parseLong(arr[0])+Long.parseLong(arr[1])+Long.parseLong(arr[2]));

	}

}
