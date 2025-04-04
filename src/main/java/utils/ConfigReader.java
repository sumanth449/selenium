package utils;

import java.io.InputStream;
import java.util.Properties;

public class ConfigReader {
    private static Properties properties;

    static {
        try (InputStream input = ConfigReader.class.getClassLoader().getResourceAsStream("config/config.properties")) {
            if (input == null) {
                throw new RuntimeException("config.properties file not found in resources/config/");
            }
            properties = new Properties();
            properties.load(input);
        } catch (Exception e) {
            throw new RuntimeException("Failed to load config.properties file", e);
        }
    }

    public static String getProperty(String key) {
        return properties.getProperty(key);
    }
}
