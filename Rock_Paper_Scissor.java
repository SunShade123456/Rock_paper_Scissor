package com.company;
import java.util.Random;
import java.util.Scanner;

//0-rock
//1-paper
//2-scissor

public class Rock_Paper_Scissor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        while (true) {
            System.out.println("Enter your choice: Rock | Paper | Scissor");
            int userinput = sc.nextInt();
            if (userinput == 9)
                break;
            if (userinput == 0)
                System.out.println("User: Rock");
            if (userinput == 1)
                System.out.println("User: Paper");
            if (userinput == 2)
                System.out.println("User: Scissor");


            int computerinput = rand.nextInt(3);
            if (computerinput == 0)
                System.out.println("Computer: Rock");
            if (computerinput == 1)
                System.out.println("Computer: Paper");
            if (computerinput == 2)
                System.out.println("Computer: Scissor");


            if ((userinput == computerinput))
                System.out.println("Draw!");
            if ((userinput == 0) && (computerinput == 1))
                System.out.println("Computer Won!");
            if ((userinput == 0) && (computerinput == 2))
                System.out.println("User Won!");
            if ((userinput == 1) && (computerinput == 0))
                System.out.println("Computer Won!");
            if ((userinput == 1) && (computerinput == 2))
                System.out.println("Computer Won!");
            if ((userinput == 2) && (computerinput == 0))
                System.out.println("Computer Won!");
            if ((userinput == 2) && (computerinput == 1))
                System.out.println("User Won!");
        }

    }
}
