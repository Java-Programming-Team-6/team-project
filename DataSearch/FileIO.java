
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.TreeMap;
import java.util.Scanner;

public class FileIO 
{
	static TreeMap<String, String> map = new TreeMap<String, String>();
	
	public static void FileInputMap()
	{
		try
		{
			BufferedReader text = new BufferedReader(new InputStreamReader(new FileInputStream("C:/Users/USER/eclipse-workspace/TeamProject/test.txt"), "UTF-8"));
			
			while(true) 
			{
				String word = text.readLine();
				String mean = text.readLine();

				if(word == null)
					break;

				map.put(word,mean);
			}
			
			text.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	
	}

	public static String DataSearch(String word)
	{
		if(!map.containsKey(word))
		{
			return "해당 단어가 존재하지 않습니다.";	
		}
	
		return map.get(word);
	}

}
