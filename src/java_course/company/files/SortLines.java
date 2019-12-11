package java_course.company.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortLines {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        try {
            BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\bla.txt"));
            String line;
            while ((line = reader.readLine()) != null) {
                strings.add(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        Collections.sort(strings);
        System.out.println(strings);
    }
}
