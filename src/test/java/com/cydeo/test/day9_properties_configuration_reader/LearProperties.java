package com.cydeo.test.day9_properties_configuration_reader;

import org.testng.annotations.Test;

import java.io.IOException;

public class LearProperties {
    @Test
    public void java_properties_read_test() throws IOException {
        System.out.println("System.getProperty(\"os.name\") = " + System.getProperty("os.name"));
        System.out.println("System.getProperty(\"user.name\") = " + System.getProperty("user.name"));
        System.out.println("System.getProperty(\"java.version\") = " + System.getProperty("java.version"));
    }
}
