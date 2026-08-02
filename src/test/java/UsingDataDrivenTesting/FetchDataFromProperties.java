package UsingDataDrivenTesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class FetchDataFromProperties {
public static void main(String[] args) throws IOException {
	//covert physical file to java object
	FileInputStream fis= new FileInputStream("./src/test/resources/Data.properties");
	
	//create an obj of properties
	Properties p=new Properties();
	
	//load the data from java obj to properties obj
	p.load(fis);
	//fetch the data from properties obj using key
	String AppURL = p.getProperty("url");
	String browserName = p.getProperty("browser");
	String UN = p.getProperty("username");
	String pswd = p.getProperty("password");
	System.out.println(AppURL);
	System.out.println(browserName);
	System.out.println(UN);
	System.out.println(pswd);
}
}
