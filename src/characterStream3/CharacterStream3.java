package characterStream3;

import java.io.*;

public class CharacterStream3 {
    public static void main(String[] args) {
        try {
            FileWriter output = new FileWriter("data.txt");
            output.write("Hello World!");
            output.write("Welcome to Java.");
            output.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            FileReader file = new FileReader("data.txt");
            String line;
            BufferedReader input = new BufferedReader(file);
            String s;
            while ((s = input.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
