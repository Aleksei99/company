package java_course.company.files;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class MultiplicationTable {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        ArrayList<Integer> arrayList = new ArrayList<>();
        String line = reader.readLine();
        StringTokenizer stringTokenizer = new StringTokenizer(line);
        String token1 =stringTokenizer.nextToken();
        String token2 =stringTokenizer.nextToken();
        int number1 = Integer.parseInt(token1);
        int number2 = Integer.parseInt(token2);

        for(int i=1;i<=number1;i++){
            for(int j=1;j<=number2;j++){
                arrayList.add(i*j);
            }
        }
        int blue=0;
        for(int i=0;i<arrayList.size();i++) {
           if(arrayList.get(i)%5==0){
             blue++;
             arrayList.remove(i);
             i--;
           }
        }
        int green=0;
        for(int i=0;i<arrayList.size();i++) {
            if(arrayList.get(i)%3==0){
                green++;
                arrayList.remove(i);
                i--;
            }
        }
        int red=0;
        for(int i=0;i<arrayList.size();i++) {
            if(arrayList.get(i)%2==0){
                red++;
                arrayList.remove(i);
                i--;
            }
        }
        int black=arrayList.size();
        String Red="RED : "+red;
        String Green="GREEN : "+green;
        String Blue="BLUE : "+blue;
        String Black="BLACK : "+black;
        try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\output.txt")){
            writer.write(Red);
            writer.append("\n");
            writer.write(Green);
            writer.append("\n");
            writer.write(Blue);
            writer.append("\n");
            writer.write(Black);
        }
        System.out.println("RED : "+red);
        System.out.println("GREEN : "+green);
        System.out.println("BLUE : "+blue);
        System.out.println("BLACK : "+black);
    }
}
