package java_course.company.files;

import java.io.*;
import java.util.Scanner;

public class A_B_C {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        Scanner scanner = new Scanner(reader);
        long result = 0;
        long A = scanner.nextInt();
        if(A==0){
            result = 1;
        }else if(A<0){
            for(int i = 1;i>=A;i--){
                result += i;
            }
        }else{
            for(int i = 0;i<=A;i++){
                result += i;
            }
        }

        String output = ""+result;

        try(FileWriter  writer = new FileWriter("C:\\Users\\User\\Desktop\\output.txt",false))
        {
            writer.write(""+result);
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
        System.out.println(result);
    }
}
