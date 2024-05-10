package utils;
import java.util.regex.*;


public class regExpMatcher  {
    public static void main(String[] args) {
        /*
    	System.setProperty ("webdriver.chrome.driver","D://seleniu//chromedriver.exe" );
		
    	WebDriver driver = new ChromeDriver();
        // And now use this to visit Google
        driver.get("file:///D:/Bala%20laptop/RPS/Examples/sample.html");
        
        String timeString = driver.findElement(By.id("txt")).getText();     
        
        System.out.println(timeString); 
        
        Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        Matcher m = p.matcher(timeString);
    */    
    	//String exampleString = "Harrybpotterabcbbb";
    	 // Pattern p = Pattern.compile(".*potter.*");
        //String begins with H
    	//Pattern p = Pattern.compile("^H.*b$");
    	
        //hh:mm:ss
    	String exampleString = "04:30:45";
     	Pattern p = Pattern.compile("[0-9]{2}:[0-9]{2}:[0-9]{2}");
        
     	
    	//String exampleString = "Jun 14, 2021";
    	
    	
    	//Pattern p = Pattern.compile("[A-Z,a-z]{3} [0-9]{2}, [0-9]{4}");
    		boolean m = patternMatch(exampleString,p);
		
    		System.out.println(m);
    	
        //Close the browser
      //  driver.quit();
    }
    
    
    public static boolean patternMatch(String s, Pattern p)
    {
    	Matcher m = p.matcher(s);
        
        return m.matches();
        
    }
}