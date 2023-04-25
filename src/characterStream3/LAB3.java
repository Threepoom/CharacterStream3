package characterStream3;

import java.io.*;

public class LAB3 {
    public static void main(String[] args) {
        PrintWriter output;

        {
            try {
                output = new PrintWriter("data.txt");
                //output.println("Hello World!");
                //output.println("Welcome to Java");
                output.println("Harry Potter");
                output.println(19);
                output.println(60.5);
                output.println(175.0);
                output.close();
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }


}
