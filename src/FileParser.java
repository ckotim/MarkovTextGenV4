import java.io.File;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

//Reads in source files using a regular expression

public class FileParser {
	private File directory;
	private Scanner fileIn;
	private int wordCount;
	private String delimiter;

	FileParser(String regex, String directory) {
		this.directory = new File(directory);
		this.wordCount = 0;
		this.delimiter = regex;
	}
	
	public void parseFile(String fileName, StringTable stringTable){
		
		Scanner scan = new Scanner(directory.getPath() + fileName).useDelimiter(delimiter);
		
		String last = "";
		String curr = "";
		String next = "";
		
		
		
		
	}

	

}


