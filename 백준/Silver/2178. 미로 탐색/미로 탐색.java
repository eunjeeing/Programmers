import java.io.*;
import java.util.*;

public class Main {
	
	public static int[][] map;
	public static boolean[][] visited;
	public static int N, M;
	static int[] dx = { -1, 1, 0, 0 };
	static int[] dy = { 0, 0, -1, 1 };
	public static int count = 0;
	
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		map = new int[N][M];
		visited = new boolean[N][M];
		
		for (int i = 0; i < N; i++) {
			String str = br.readLine();
			for (int j = 0; j < M; j++) {
				map[i][j] = str.charAt(j) - '0';
			}
		}
		
		visited[0][0] = true;
		bfs(0, 0);
		System.out.println(map[N-1][M-1]);
		
	}
	
	public static void bfs(int x, int y) {
		Queue<int[]> q = new LinkedList<>();
		q.offer(new int[] {x, y});
		
		while(!q.isEmpty()) {
			int[] now = q.poll();
			int nowX = now[0];
			int nowY = now[1];
			
			for (int i = 0; i < 4; i++) {
				int nextX = nowX + dx[i];
				int nextY = nowY + dy[i];
				
				if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) continue;
				if (visited[nextX][nextY] || map[nextX][nextY] == 0) continue;
				
				q.offer(new int[] {nextX, nextY});
				map[nextX][nextY] = map[nowX][nowY] + 1;
				visited[nextX][nextY] = true;
			}
		}
	}
	
	
}
