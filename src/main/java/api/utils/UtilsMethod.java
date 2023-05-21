package api.utils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.Properties;

/**
 * @author Bohdan Brukhovets
 * @link https://www.linkedin.com/in/bohdan-brukhovets/
 */
public class UtilsMethod {
    public static String getValue(String value) {
        Properties properties = new Properties();
        try (FileInputStream inputStream =
                     new FileInputStream("src\\test\\resources\\userDataProperties")) {
            properties.load(inputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        String data = properties.getProperty(value);
        try {
            data = new String(data.getBytes(), StandardCharsets.UTF_8);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        return data;
    }
}
