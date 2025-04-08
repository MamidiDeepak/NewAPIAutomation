package org.ShareAbleAPIAutomationFramework.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadKeyFromFile {

    public static String readkeyusingFile(String key){
        Properties properties = new Properties();

        try {
            FileInputStream file = new FileInputStream("src/test/resources/data.properties");
            properties.load(file);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return properties.getProperty(key);
    }
}
