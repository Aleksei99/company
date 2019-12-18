package java_course.company.files;

import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Lines_and_Numbers {
    public static void main(String[] args) throws IOException {
        int i = 0;
        int countOf3 = 0;
        int countOf4 = 0;
        String answer;
        StringBuffer marks4Str = new StringBuffer();
        StringBuffer marks3Str = new StringBuffer();
        BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\User\\Desktop\\input.txt"));
        Scanner scanner = new Scanner(reader);
        int size = scanner.nextInt();
        int[] arrayOfDates = new int[size];
        scanner.nextLine();
        String line = scanner.nextLine();
        StringTokenizer stringTokenizer = new StringTokenizer(line);
        while (stringTokenizer.hasMoreTokens()) {
            String token = stringTokenizer.nextToken();
            int number = Integer.parseInt(token);
            arrayOfDates[i] = number;
            i++;
        }
        for (Integer a : arrayOfDates) {
            if (a % 2 == 0) {
                marks4Str.append(a.toString() + " ");
                countOf4++;
            } else {
                marks3Str.append(a.toString()).append(" ");
                countOf3++;
            }
        }
        if (countOf4 < countOf3) {
            answer = "NO";
        } else {
            answer = "YES";
        }

        System.out.println("Тройки" + marks3Str);
        System.out.println("Четвёрки" + marks4Str);
        System.out.println(answer);

        try(FileWriter writer = new FileWriter("C:\\Users\\User\\Desktop\\output.txt"))
        {
            writer.write(String.valueOf(marks3Str));
            writer.append("\n");
            writer.write(String.valueOf(marks4Str));
            writer.append("\n");
            writer.write(answer);
        }
    }
}
