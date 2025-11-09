import java.io.FileReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        int count = 0;
        try{
            FileReader fr = new FileReader("file.txt");

            while(fr.read() != -1){
                count++;
            }

            fr.close();

            System.out.println("Number of chracters in the file: " + count);
        }catch (IOException e){
            System.out.println("An error occured");
        }
    }
}