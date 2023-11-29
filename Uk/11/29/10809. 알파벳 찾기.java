import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int[] iarr= new int[26];
        
        for(int i = 0; i < iarr.length; i++) {
        	iarr[i] = -1;
		}
        
        for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
    
			if(iarr[ch - 'a'] == -1) {
				iarr[ch - 'a'] = i;
			}
		}        
        
		for(int val : iarr) {
			System.out.print(val + " ");
		}
        sc.close();
    }
}
