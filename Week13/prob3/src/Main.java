import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try{
            FileReader in = new FileReader("fileA.txt");
            FileWriter out = new FileWriter("fileB.txt");

            int a;
            while ((a = in.read()) != -1) {
                out.write(a);
            }

            in.close();
            out.close();

            System.out.println("File copied successfuly.");

        } catch (IOException e) {
            System.out.println("An error occured.");
        }
    }
}