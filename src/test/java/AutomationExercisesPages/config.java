package AutomationExercisesPages;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class config {

	public static Properties property;
	
	private static String configpath="Utils/config.properties";

public static void runconfigfile() throws IOException
{
	
	property =new Properties();
	InputStream infile=new FileInputStream(configpath);
	property.load(infile);
}




}
