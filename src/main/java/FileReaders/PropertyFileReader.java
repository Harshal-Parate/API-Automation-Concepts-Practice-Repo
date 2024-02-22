package FileReaders;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileReader {

    public static String readConfigData(String keyWord) {
        Properties properties = new Properties();
        FileInputStream fis = null;
        try {
            fis = new FileInputStream("src/test/resources/ConfigData/Configuration.properties");
            properties.load(fis);
        }
        catch (Exception ignored) {}
        return properties.getProperty(keyWord);
    }

    public static void main(String[] args) {
        System.out.println(readConfigData("BaseURI"));
    }
}