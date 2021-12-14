import java.io.*;
import java.util.*;

public class wormholes {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(new File("wormhole.in")));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("wormhole.out")));
		
		int n = Integer.parseInt(br.readLine());
		
		int[][] holes = new int[n][2];
		
		for(int i = 0; i < n; i ++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			holes[i][0] = Integer.parseInt(st.nextToken());
			holes[i][1] = Integer.parseInt(st.nextToken());
		}
		
		
		
		br.close();
		pw.close();
	}
}
