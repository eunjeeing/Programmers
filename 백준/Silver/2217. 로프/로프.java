import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		Integer[] arr = new Integer[N];
		for(int i = 0; i < N; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
        Arrays.sort(arr, Collections.reverseOrder()); 
        int sum = 0;
        for (int i = 0; i < N; i++) {
            sum = Math.max(sum, arr[i] * (i+1));
        }
        System.out.println(sum);
	}

}