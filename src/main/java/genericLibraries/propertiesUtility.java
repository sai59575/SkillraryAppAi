package genericLibraries;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

/**
 * This class contains reusable methods to read data from properties file
 * @param sai
 */
public class propertiesUtility {
	private Properties property;
	public void propertiesInitializaton(String filepath) {
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(filepath);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		property = new Properties();
		
		try {
			property.load(fis);
			}catch (IOException e) {
				e.printStackTrace();
			}
		}


/**
 * This method is used to fetch data from properties file
 * @param key
 * @return
 */
  public String readFromproperties(String key) {
	  return property.getProperty(key);
  }
}

