import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int s = Integer.parseInt(br.readLine()) + 1;
        int result = 0;
        for(int i = 1; i * i < s; i++) {
        	result++;
        }

        System.out.println(result);
	}

}
