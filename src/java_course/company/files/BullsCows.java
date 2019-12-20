package java_course.company.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class BullsCows {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        ArrayList<Integer> firstNumber = new ArrayList<>();
        ArrayList<Integer> secondNumber = new ArrayList<>();
        int rightNumber_andPosition=0;
        int rightNumber_and_wrong_Position=0;
        for (int i = 0; i < 4; i++) {
            firstNumber.add(reader.read());
        }
        reader.read();
        for (int i = 0; i < 4; i++) {
            secondNumber.add(reader.read());
        }
        for (int i = 0; i < firstNumber.size(); i++) {
            for (int j = 0; j < secondNumber.size(); j++) {
                if(firstNumber.get(i).equals(secondNumber.get(j)) && i==j){
                    rightNumber_andPosition++;
                    continue;
                }
                if(firstNumber.get(i).equals(secondNumber.get(j))){
                    rightNumber_and_wrong_Position++;
                }
            }
        }
        try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\output.txt")) {
            writer.write(""+rightNumber_andPosition);
            writer.write(" ");
            writer.write(""+rightNumber_and_wrong_Position);
        }
    }
}
