package java_course.company.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class NumberE {
    public static void main(String[] args) throws IOException {
        int[] E={2,7,1,8,2,8,1,8,2,8,4,5,9,0,4,5,2,3,5,3,6,0,2,8,7,5};
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        String line = reader.readLine();
        int number = Integer.parseInt(line);

        try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\output.txt")) {
            if(number == 0){
                writer.write(""+3);
            }else{
                for(int i = 0;i<=number;i++){
                    if(i==1){
                        writer.write(".");
                    }
                    if(i==number && i !=25){
                        if(E[i+1]>=5){
                            writer.write(""+(E[i]+1));
                        }else writer.write("" + E[i]);
                    }else {
                        writer.write("" + E[i]);
                    }
                }
            }
        }
    }
}
