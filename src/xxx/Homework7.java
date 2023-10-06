package xxx;

import java.io.*;

public class Homework7 {
	public static void main(String[] args) throws IOException {
		File file = new File("."+File.separator+"Sample.txt");
		FileReader fr = new FileReader(file);
		BufferedReader br = new BufferedReader(fr);
		String str;
		int row = 0, word = 0;
		while ((str = br.readLine()) != null) {
			row++;
			word += str.length();
		}
		System.out.println("Sample.txt檔案共有" + file.length() + "個位元組，" + word + "個字元，" + row + "列資料");
		br.close();
		fr.close();
	}
}
