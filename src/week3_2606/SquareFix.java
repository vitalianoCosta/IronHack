package week3_2606;

import java.util.*;

public class SquareFix {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;
        System.out.println("enter a number: ");

        try{
            num = scan.nextInt();
            System.out.println("The squasre of " +num + " is " + num*num);
        }
        catch (InputMismatchException ex){
            System.out.println("You entered bad data, try again");
            System.out.println("Run the program again");
        }

        System.out.println("Good Bye!!");
    }
}
