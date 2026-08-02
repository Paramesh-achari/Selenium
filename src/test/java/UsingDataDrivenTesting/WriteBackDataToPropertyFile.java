package UsingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class WriteBackDataToPropertyFile {
public static void main(String[] args) throws IOException {
	//convert physical file to java object
	FileInputStream fis=new FileInputStream("./src/test/resources/Data.properties");
	//create an obj of properties
	Properties p=new Properties();
	//load the properties object
	p.load(fis);
	//write back the data
	p.put("Testing", "selenium");
	//convert properties object to physical file
	FileOutputStream fos=new FileOutputStream("./src/test/resources/Data.properties");
	p.store(fos, "Course updated");
}
}
