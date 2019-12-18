package java_course.company.files;

import java.io.*;
import java.util.Scanner;

public class A_B {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        Scanner scanner = new Scanner(reader);
        int result = 0;
        String answer;
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        result = A*B;

        if(result==C){
            answer="YES";
        }else answer="NO";

        try(FileOutputStream out=new FileOutputStream("C:\\Users\\User\\Desktop\\output.txt");
            BufferedOutputStream bos = new BufferedOutputStream(out))
        {
            byte[] buf = answer.toString().getBytes();
            bos.write(buf);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(answer);
    }
}
