import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    static void fun1 (String path) throws IOException{
        FileReader f = new FileReader(path);
    }

    static void fun2 (String path) throws IOException{
        fun1(path);
    }

    static void fun3 (String path){
        try {
            fun2(path);
        } catch (IOException e) {
            System.out.println("File Not Found");
        }
    }

    public static void main(String[] args) {
        fun3("myfile.txt");
    }
}

//Write a program of your choice where a Checked Exception occurs at
//third function but handled at the first calling function. Use both ways of
//managing Checked Exception i.e. using try-catch block and throws
//keyword.