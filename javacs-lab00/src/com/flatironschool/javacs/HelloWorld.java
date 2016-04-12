package com.flatironschool.javacs;

public class HelloWorld {
    public static Double getVersion() {
        String version = System.getProperty("java.version");
        String[] version_arr = version.split("\\.");
        return Double.parseDouble(version_arr[0] + "." + version_arr[1]);
    }

    public static void main(String[] args) {
        System.out.println(getVersion());
    }
}

