import java.io.*;

public class Main {
    public static void main(String[] args) {

        int lineCount = 0;

        try{
            BufferedReader file = new BufferedReader(new FileReader("file.txt"));

            while(file.readLine() != null){
                lineCount++;
            }

            file.close();

            System.out.println("Number of lines in the file: " + lineCount);

        }catch (IOException e){
            System.out.println("An error occured");
        }
    }
}