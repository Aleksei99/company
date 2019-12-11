package java_course.company.files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.StringTokenizer;

public class UniqueWordsInFile {
    public static void main(String[] args) {
        HashSet<String> list = new HashSet<>();
        File[] files = new File("C:\\Users\\User\\Desktop\\blaFolder").listFiles();
        try {
            assert files != null;
            for (File file : files) {
                BufferedReader reader = new BufferedReader(new FileReader(file));
                String line;
                while ((line = reader.readLine()) != null) {
                    StringTokenizer stringTokenizer = new StringTokenizer(line);
                    while (stringTokenizer.hasMoreTokens()) {
                        String token = stringTokenizer.nextToken();
                        list.add(token);
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        int count = 0;
        for (String el : list) {
            count++;
        }
        System.out.println(count);
    }
}
