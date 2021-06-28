package week3_2606;
import java.io.*;

public class ThrowsException {
    public static void main(String[] args) {
        try{
            fetchFile();
        }
        catch(InvalidClassException ex1){
            System.out.println(ex1.getMessage());
        }
        catch(IOException ex2){
            System.out.println(ex2.getMessage());
        }
    }
    public static void fetchFile() throws NullPointerException, InvalidClassException, IOException{

    }
}
