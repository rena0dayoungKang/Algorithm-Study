import java.util.*;
import java.io.*;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        StringBuilder sb = new StringBuilder();

        st = new StringTokenizer(br.readLine(), " ");
        for (int i = 0; i < N; i++) {
            int bi = Integer.parseInt(st.nextToken());
            if (bi < X)
                sb.append(bi + " ");
        }
        br.close();
        System.out.println(sb);
    }
}
