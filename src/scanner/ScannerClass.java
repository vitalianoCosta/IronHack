package scanner;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please type a string");
        String str = scan.nextLine();
        String[] listOfWords = str.split(" ");
        int counter = 0;
        for (int i = 0; i < listOfWords.length; i++) {
            if(listOfWords[i].startsWith("a") || listOfWords[i].startsWith("e")|| listOfWords[i].startsWith("i") || listOfWords[i].startsWith("o")|| listOfWords[i].startsWith("u") || listOfWords[i].startsWith("y") || listOfWords[i].startsWith("A") || listOfWords[i].startsWith("E") || listOfWords[i].startsWith("I") || listOfWords[i].startsWith("O") || listOfWords[i].startsWith("U") || listOfWords[i].startsWith("Y")){
                counter++;
            } else{
                System.out.println("Error: " + listOfWords[i]);
            }
        }
        System.out.println("The number of words start with a vowel: " + counter);
    }
}
