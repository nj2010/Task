package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

    private static Properties properties;

    /**
     * here we will load our Configuration file so that this class can read from it
     *
     */
    static {
        try{
            String path = "src/test/resources/fetchrewards_configs.properties";
            FileInputStream input = new FileInputStream(path);
            properties =new Properties();
            properties.load(input);
            input.close();
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    /**
     * getProperty() method will read a value from fetchrewars_configs.properties file
     * and return the property of the file.
     * @param key
     * @return
     */
    public static String getProperty(String key){
        return properties.getProperty(key);
    }
}
