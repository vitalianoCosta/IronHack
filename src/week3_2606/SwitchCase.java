package week3_2606;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        boolean gotInt = false;

        while(!gotInt){
            System.out.println("Enter int: ");

            if(scan.hasNextInt()){
                gotInt = true;
            }
            else{
                scan.next(); // clears current imput
                System.out.println("Not an integer");
            }
        }
        int theInt = scan.nextInt();
    }
}
