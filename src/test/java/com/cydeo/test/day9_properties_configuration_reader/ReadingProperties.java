package com.cydeo.test.day9_properties_configuration_reader;

import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadingProperties {

    @Test
    public void reading_properties_file_test() throws IOException {

        // 1. Create the object of properties classes
        // We need properties class to use methods coming from class like load(), getProperty("key")
        Properties properties = new Properties();

        // 2. Creating the object of FileInputStream class
        // We need this object to open file as a String in Java memory
        FileInputStream file = new FileInputStream("configuration.properties");

        // 3. Load the properties object using fileInputStream object
        // Load "properties" object with the "file" we opened using FileInputSteam
        properties.load(file);


        String GotUpTime = "GotUpTime: "+properties.getProperty("GotUpTime");
        String StartedStudyTime = "StartedStudyTime: "+properties.getProperty("StartedStudyTime");
        String Java = "java: "+properties.getProperty("Java");
        String Selenium = "Selenium: "+properties.getProperty("Selenium");
        String English = "English: "+properties.getProperty("English");
        String OCA = "OCA: "+properties.getProperty("OCA");
        String Mentoring = "Mentoring: "+properties.getProperty("Mentoring");
        String word = properties.getProperty("Total");
        String Blockers = "Blockers: "+properties.getProperty("Blockers");
        System.out.println(Blockers);
    }
}
