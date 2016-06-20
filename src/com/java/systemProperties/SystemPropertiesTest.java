package com.java.systemProperties;

import java.util.Properties;



public class SystemPropertiesTest {
    private static Properties _runtime = new Properties();
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("System Properties :"+_runtime);
        _runtime.setProperty("hello.system", "welcome");
        System.out.println("System Properties :"+_runtime);
    }

}
