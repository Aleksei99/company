package java_course.company.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class BinaryWords {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\output.txt");
        int symbol = bufferedReader.read();
        int k = 0;
        while (symbol != -1) {
            char c = (char) symbol;
            if (c == '0') {
                k++;
            } else if (c == '1') {
                char w = (char) ('a' + k);
                String ans = Character.toString(w);
                writer.write(ans);
                writer.flush();// выгрузка ресурсов.Без try c ресурсами надо это писать
                k = 0;
            }
            symbol = bufferedReader.read();
        }
    }
}
