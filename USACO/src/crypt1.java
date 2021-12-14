/*
 * 
 */

import java.io.*;
import java.util.*;

public class crypt1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new FileReader(new File("crypt1.in")));
		PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter("crypt1.out")));
		
		int n = Integer.parseInt(br.readLine());
		ArrayList<Integer> digits = new ArrayList<>();
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for(int i = 0; i < n; i ++) {
			digits.add(Integer.parseInt(st.nextToken()));
		}
		
		int count = 0;
		
		int top = 0;
		int d = 0;
		int e = 0;
		
		if(valid(top, d, e, digits)) {
			count ++;
		}
		
		for(int i = 0; i < n; i ++) {
			int a = digits.get(i);
			for(int j = 0; j < n; j ++) {
				boolean b_large = false;
				int b = digits.get(j);
				for(int k = 0; k < n; k ++) {
					boolean c_large = false;
					int c = digits.get(k);
					int num = 100*a + 10*b + c;
					for (int l = 0; l < n; l ++) {
						d = digits.get(l);
						if(d*num<1000) {
							for(int m = 0; m < n; m ++) {
								e = digits.get(m);
								if(e*num<1000) {
									boolean works = true;
									int f = 10*d + e;
									if(f*num<10000) {
										String s = String.valueOf(f*num);
										for(int p = 0; p < s.length(); p ++) {
											if(!digits.contains(s.charAt(p))) {
												works = false;
												break;
											}
										}
									}
								} else {
									c_large = true;
									break;
								}
							}
						} else {
							c_large = true;
							break;
						}
					}
					if(c_large) {
						break;
					}
				}
			}
		}
		
		br.close();
		pw.close();
	}
	
	public static boolean valid(int top, int d, int e, ArrayList<Integer> digits) {
		int n = digits.size();
		boolean works = true;
		if(d*top<1000) {
			String s = String.valueOf(d*top);
			for(int j = 0; j < s.length(); j ++) {
				if(!digits.contains(s.charAt(j))) {
					works = false;
					break;
				}
			}
		}
		if(!works) {
			return works;
		}
		
		if(e*top<1000) {
			String s = String.valueOf(d*top);
			for(int j = 0; j < s.length(); j ++) {
				if(!digits.contains(s.charAt(j))) {
					works = false;
					break;
				}
			}
		}
		if(!works) {
			return works;
		}
		
		int de = 10*d+e;
		
		if(de*top<10000) {
			String s = String.valueOf(de*top);
			for(int j = 0; j < s.length(); j ++) {
				if(!digits.contains(s.charAt(j))) {
					works = false;
					break;
				}
			}
		}
		
		return works;
	}

}
