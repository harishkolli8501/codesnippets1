package configRead;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigRead {

	public static void main(String[] args) throws IOException {

		Properties prop = new Properties();
		File file = new File(System.getProperty("user.dir")+"/src/configs/configs.properties");
		FileInputStream fis = new FileInputStream(file);
		prop.load(fis);
		String str= prop.getProperty("Site");
		System.out.println(str);
	}

}
