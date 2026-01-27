package com.example;
import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;

public class Activity14 {
    public static void main(String[] args) throws IOException {

        File file = new File("sample.txt");

        FileUtils.writeStringToFile(file, "Hello Activity 14", "UTF-8");

        String data = FileUtils.readFileToString(file, "UTF-8");
        System.out.println(data);

        File dir = new File("backup");
        dir.mkdir();

        FileUtils.copyFileToDirectory(file, dir);

        System.out.println("Done");
    }
}


