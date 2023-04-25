package characterStream3;

import java.io.*;


public class LAB5 {
    public static void main(String[] args) {
       InputStreamReader in = new InputStreamReader(System.in);
       BufferedReader input = new BufferedReader(in);

        try {
            System.out.print("Enter name: ");
            String name = input.readLine();
            System.out.println("Hello " + name);
            System.out.print("Enter age: ");
            String age = input.readLine();
            System.out.println(age);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
