import java.util.*;
import java.io.*;

public class Main {
	static int N, M;
	static boolean[] check;
	static int[] arr, arr2;
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws Exception {
	
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		check = new boolean[N+1];
		arr = new int[N+1];
		arr2 = new int[N+1];
		st = new StringTokenizer(br.readLine());
		for(int i = 1; i <= N; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		backTracking(1, 0, 0);
		
		System.out.println(sb);
        br.close();
	}
	
	static void backTracking (int at, int idx, int depth) {
		if (depth == M) {
			for (int i = 1; i < depth + 1; i++) {
				sb.append(arr2[i] + " ");
			}
			sb.append("\n");
			return;
		}
		
		for (int i = at; i < N + 1; i++) {
			if(!check[i]) {
				check[i] = true;
				arr2[depth+1] = arr[i];
				
				backTracking(i, i+1, depth+1);
				check[i] = false;
			}
		}
	}
	
}
