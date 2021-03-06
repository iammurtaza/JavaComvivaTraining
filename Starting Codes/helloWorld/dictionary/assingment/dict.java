package assingment;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.HashSet;

public class dict {
	public static void main(String[] args) throws IOException {

		BufferedReader br1 = new BufferedReader(
				new FileReader("dictionary.txt"));
		String line;

		HashMap<String, HashSet<String>> map = new HashMap<String, HashSet<String>>();

		while ((line = br1.readLine()) != null) {
			HashSet<String> set = new HashSet<String>();
			String arr[] = line.split(":", 2);
			String arr2[] = arr[1].split(",");
			for (int i = 0; i < arr2.length; i++) {
				set.add(arr2[i]);
			}
			map.put(arr[0], set);
		}
		br1.close();

		int flag2 = 1;
		while (flag2 == 1) {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			System.out
					.println("What word you want to know synonym of: (write q to exit)");
			String query = br.readLine();
			if (!query.equals("q")) {
				if (map.get(query) == null) {
					System.out
							.println("Do you want to add this word (write yes to add)");
					String response = br.readLine();
					if (response.equals("yes")) {
						System.out.println("Word " + query + " has been added");
						int flag = 1;
						HashSet<String> set2 = new HashSet<String>();
						while (flag == 1) {
							System.out
									.println("Write synonyms (write q to stop)");
							String synonym = br.readLine();
							if (synonym.equals("q")) {
								flag = 0;
							}
							if (flag != 0) {
								set2.add(synonym);
							}
						}
						map.put(query, set2);
						File file = new File("dictionary.txt");
						FileWriter fw = new FileWriter(file, true);
						BufferedWriter bw = new BufferedWriter(fw);
						bw.newLine();
						bw.write(query + ":");
						int ele = set2.size();
						int counter = 0;
						for (String temp : set2) {
							counter++;
							bw.write(temp);
							if (ele != counter)
								bw.write(",");
						}
						bw.newLine();
						bw.close();
					}
				} else {
					System.out.println(map.get(query));
				}
			} else {
				flag2 = 0;
			}
		}
	}
}
