package Conditionals.additionaltask;

import java.util.Scanner;

public class Distance {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Please enter any number: %n");
        int number = scan.nextInt();

        if (number >= -5 && number <= 3){
            System.out.println("Your number is in the (-5:3) range");
        }else{
            System.out.println("Boomer! you insert the wrong number");
        }

    }
}
