package Dictionary;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;

public class FileIO {
  static TreeMap<String, String> map = new TreeMap<String, String>();
	private static boolean status = false;
	
	public static void FileInputMap() {
		try {
			BufferedReader text = new BufferedReader(
					new InputStreamReader(new FileInputStream("C:\\DictionaryData\\words.txt"), "UTF-8"));
			
			while(true) {
				String word = text.readLine();
				String mean = text.readLine();
				
				if(word == null)
					break;
				
				map.put(word, mean);
			}
			
			text.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static String DataSearch(String word) {
		
		if(!map.containsKey(word)) {
			setStatus(false);
			return "해당 단어가 존재하지 않습니다.";
		}
		
		setStatus(true);
		return map.get(word);
	}
	
	public static void setStatus(boolean bool) {
		status = bool;
	}
	
	public boolean getStatus() {
		return status;
	}
}
