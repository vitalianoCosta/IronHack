package week3_2606;

import java.util.Scanner;

public class errorhandling {
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
/*
private static int statInput(int statMin, int statMax, String message){
        Scanner scanner = new Scanner(System.in);
        System.out.println(message);
        String tmp = scanner.nextLine();
        try {
            int choice = Integer.parseInt(tmp);
            if (choice >= statMin && choice <= statMax){
                return choice;
            }
            else {
                System.out.println("Please enter a valid number");
                statInput(statMin, statMax, message);
            }
        }
        catch (NumberFormatException e){
            System.out.println("Please enter a valid number");
            statInput(statMin, statMax, message);
        }
        return statMin;
    }
 */