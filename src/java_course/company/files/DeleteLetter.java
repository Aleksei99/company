package java_course.company.files;

import java.io.*;
import java.util.StringTokenizer;

public class DeleteLetter {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        String line = reader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(line);
        String tokenNumber = stringTokenizer.nextToken();
        int position = Integer.parseInt(tokenNumber);
        String wrongWord = stringTokenizer.nextToken();
        StringBuffer stringBuffer = new StringBuffer(wrongWord);

        try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\output.txt"))
        {
            if(wrongWord.length()>=position) {
                stringBuffer.deleteCharAt(position);
                writer.write(String.valueOf(stringBuffer));
            }else{
                writer.write(wrongWord);
            }
        }
        char ch ='a'+1;
        System.out.println(ch);

        System.out.println(stringBuffer);
    }
}
