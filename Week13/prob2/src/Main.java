import java.io.FileWriter;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        try {
            FileWriter writer = new FileWriter("example.txt");

            writer.write("Hello, this is a test message written to the file.\n");
            writer.write("You can add multiple lines as well!\n");

            writer.close();

            System.out.println("Successfully wrote to the file.");

        } catch (IOException e) {
            System.out.println("An error occurred while writing to the file.");
        }
    }
}
