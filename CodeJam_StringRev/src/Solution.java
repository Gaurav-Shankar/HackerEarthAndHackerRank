

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;


public class Solution {

	public void getAns() throws Exception {
		BufferedReader br = new BufferedReader(new FileReader(new File("A-small-1-attempt0.in")));
		BufferedWriter bw = new BufferedWriter(new FileWriter(new File("A-large-practice.out")));
		String s = br.readLine();
		int t = Integer.parseInt(s);
		for (int i = 1; i <= t; i++) {
			HashMap<String, ArrayList<String>> friends = new HashMap<String, ArrayList<String>>();
			s = br.readLine();
			int m = Integer.parseInt(s);
			for (int j = 0; j < m; j++) {
				s = br.readLine();
				String[] names = s.split(" ");
				if (friends.containsKey(names[0])) {
					friends.get(names[0]).add(names[1]);
				}
				else {
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(names[1]);
					friends.put(names[0], temp);
				}
				if (friends.containsKey(names[1])) {
					friends.get(names[1]).add(names[0]);
				}
				else {
					ArrayList<String> temp = new ArrayList<String>();
					temp.add(names[0]);
					friends.put(names[1], temp);
				}
			}
			
			boolean tr = true;
			HashMap<String, Boolean> check = new HashMap<String, Boolean>();
			Queue<String> q = new LinkedList<String>();
			Iterator it = friends.keySet().iterator();
			
			while(it.hasNext()) {
				String key = (String)it.next();
				if (!check.containsKey(key)) {
					boolean tt = true;
					q.offer(key);
					check.put(key, tt);
					while (!q.isEmpty()) {
						key = q.poll();
						tt = !check.get(key);
						ArrayList<String> temp = friends.get(key);
						for (int k = 0; k < temp.size(); k++) {
							String tof = temp.get(k);
							if (check.containsKey(tof)) {
								if (check.get(tof) != tt) {
									bw.write("Case #" + i + ": No" + "\n");
									tr = false;
									break;
								}
							}
							else {
								check.put(tof, tt);
								q.offer(tof);
							}
						}
					}
				}
			}
			
			if (tr) bw.write("Case #" + i + ": Yes" + "\n");
		}
		br.close();
		bw.close();
	}
	
	public static void main(String[] args) throws Exception {
		Solution so = new Solution();
		so.getAns();
	}

}
