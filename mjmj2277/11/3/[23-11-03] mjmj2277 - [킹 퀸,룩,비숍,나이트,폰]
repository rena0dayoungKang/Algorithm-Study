import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] num = str.split(" ");
        int[] chess = {1, 1, 2, 2, 2, 8};
        int[] answer = new int[6];

        for (int i = 0; i < 6; i++) {
            answer[i] = chess[i] - Integer.parseInt(num[i]);
        }

        for (int i = 0; i < 6; i++) {
            System.out.print(answer[i] + " ");
        }
    }
}
