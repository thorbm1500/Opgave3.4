package com.company;
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        System.out.println("I'm thinking of a number between 1 and 100");
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type a number: ");
        int Input = scanner.nextInt();
        System.out.println("Your guess is: "+Input);
        System.out.println("The number I was thinking of is: "+number);
        System.out.println("You were off by: "+(Input-number));
    }
}
