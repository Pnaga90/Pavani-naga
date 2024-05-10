package utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;

public class FileNameMaker {
	
	

	private static final DateTimeFormatter DateTimeFormetter = null;

	public String fileNameForLogging(String u, String p)
	{
	
	String filename;
	
	LocalDateTime now = LocalDateTime.now();
	System.out.println("Before Formatting: " + now);
	 
    DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-mm-yyyy HH-mm");
    filename = "C:\\\\Users\\\\Administrator\\\\Desktop/pavani\\"+ u + "_" + p +"_" + now.format(format) + ".jpg";
    
    return (filename);

	}
}
