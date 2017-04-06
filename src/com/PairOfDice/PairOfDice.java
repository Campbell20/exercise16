package com.PairOfDice;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
* Name: John Campbell
* Section: COSC/ITSE 
* Homework: exercise 16
* Description: This program rolls two dices 1000 times, stores all the possible combinations of the dice rolls into an
 * array, and then prints out the doubles that occur to the console.
*/

//name of the class according the exercise requirements. The class creates 2 die, an array of 12 elements, and puts all
//possible dice roll combinations from the two die being rolled 1000 times.
public class PairOfDice {
    int intDie1; //our first die
    int intDie2; //our second die
    int intMaxDiceRoll = 1000; //how many times do you want the program to roll the dice?

    String strUserInput = ""; //user's input
    ArrayList<Integer> intDiceCombos = new ArrayList<>(); // our array of all possible dice rolls

    //constructor of PairOfDice class
    public PairOfDice() {
        BeginProgram();
    }

    //begins the program for the user. Telling the user what will happen and why
    private void BeginProgram() {
        System.out.println("Type anything and press enter to roll the dice " + intMaxDiceRoll + " times.");
        System.out.println("The system will automatically determine how many double sixes you rolled.");
        Scanner objInput = new Scanner(System.in);
        strUserInput = objInput.next();
        CreateArray();
    }

    //create a blank array of 12 elements. All of the double rolls will go into each element in the array.
    private void CreateArray() {
        intDiceCombos.clear();
        for (int i = 0; i <= 12; i++) {
            intDiceCombos.add(0);
            //System.out.println(intDiceCombos); //testing array to make sure it's working
        }
        RandomDiceRoll();
    }

    //create a random roll for each pair of dice. Then add any double and put it into the correct element in the array.
    private void RandomDiceRoll() {
        System.out.println();
        System.out.println("Rolling the dice... good luck!");
        System.out.println();
        for (int intIndex = 0; intIndex < intMaxDiceRoll; intIndex++) {
            Random objRandom1 = new Random();
            intDie1 = objRandom1.nextInt(6) + 1;
            intDie2 = objRandom1.nextInt(6) + 1;
            intDiceCombos.set(intDie1 + intDie2, intDiceCombos.get(intDie1 + intDie2) + 1);
        }
        //System.out.println(intDiceCombos); //testing array to make sure it's working
        PrintCombos();
    }

    //get all of the possible combinations (exercise is only asking for double 6s), and print them to user
    private void PrintCombos(){
        //two 6s
        System.out.println("You rolled " + intDiceCombos.get(12) + " Boxcars.");
        System.out.println();

        /*additional dice rolls
        System.out.println("You also rolled: ");

        //1 and 1
        System.out.println(intDiceCombos.get(2) + "\tSnake Eyes (1 and 1)");

        //1 and 2
        //System.out.println(intDiceCombos.get(3) + "\tCross Eyes (1 and 2)");

        //2 and 2
        System.out.println(intDiceCombos.get(4) + "\tLittle Joes (2 and 2)");

        //2 and 3, or 1 and 4
        //System.out.println(intDiceCombos.get(5) + "\tThirty-two Juice (2 and 3, or 1 and 4)");

        //3 and 3
        System.out.println(intDiceCombos.get(6) + "\tMy Sisters (3 and 3)");

        //3 and 4, or 2 and 5, or 1 and 6
        //System.out.println(intDiceCombos.get(7) + "\tNatural Sevens (3 and 4, or 2 and 5, or 1 and 6)");

        //4 and 4
        System.out.println(intDiceCombos.get(8) + "\tSquare Pairs (4 and 4)");

        //4 and 5, or 3 and 6, or 2 and 7
        //System.out.println(intDiceCombos.get(9) + "\tNina from Pasadena (4 and 5, or 3 and 6, or 2 and 7)");

        //5 and 5
        System.out.println(intDiceCombos.get(10) + "\tPuppy Paws (5 and 5)");

        //5 and 6
        //System.out.println(intDiceCombos.get(11) + "\tSix Five, No Jive! (5 and 6)");
        System.out.println();
        */
    }
}
