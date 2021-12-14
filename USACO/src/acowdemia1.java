import java.io.*;
import java.util.*;

public class acowdemia1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		
		int n = 0;
		int l = 0;
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		l = Integer.parseInt(st.nextToken());
		
		st = new StringTokenizer(br.readLine());
		
		int[] index = new int[n];
		
		for(int i = 0; i < n; i ++) {
			index[i] = Integer.parseInt(st.nextToken());
		}
		
		int maxh = 0;
		
		for(int i = 0; i < n; i ++) {
			// System.out.println(maxh);
			boolean large = false;
			if(index[i]>n) {
				large = true;
			}
			if(large) {
				continue;
			} else {
				int count = 0;
				for(int j : index) {
					if(j>=index[i]) {
						count ++;
					}
				}
				if(count >= index[i]) {
					maxh = Math.max(index[i], maxh);
				}
			}
		}
		// System.out.println(maxh);
		
		for(int i = 0; i < l; i ++) {
			int maxh_index = 0;
			for(int j = 0; j < n; j ++) {
				// System.out.println(maxh);
				int[] copy = index;
				copy[j] ++;
				boolean large = false;
				if(copy[j]>n) {
					large = true;
				}
				if(large) {
					continue;
				} else {
					int count = 0;
					for(int k : copy) {
						if(k>=copy[j]) {
							count ++;
						}
					}
					if(count >= copy[j]) {
						maxh = Math.max(copy[j], maxh);
						maxh_index = j;
						// System.out.println("Index: " + maxh_index);
					}
				}
			}
			index[maxh_index] ++;
		}
		// System.out.println(maxh);
		
		pw.println(maxh);
		
		br.close();
		pw.close();
	}

}
