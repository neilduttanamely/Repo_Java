package Class5;

public class Homework4<restLetters, firstLetter> {
    public static void main(String[] args) {

        /**
         * Due date: Mar 13 (Sunday)
         */

        /**
         * Task -1
         * using Ternary operator assign value to int-variable
         *
         * Variable -> result1
         * if the length of sentence1-String is greater or equals to 5
         *      value in result1 should be 10
         * else
         *      value in result should be 15
         *
         * print:
         *      value of sentence1
         *      length of sentence1
         *      value of result1
         */
        String sentence1 = "hhhh";
        System.out.println(sentence1);

        /**
         * Task - 2
         *
         * Create a String Variable and store your full name in it.
         * Print the following values:
         *  1. length of your full name
         *  2. check if your name ends with "a" (ignore the case)
         *  3. check if your name contains with "a" (ignore the case)
         *
         */
        String txt = "Neil Dutta";
        String myName = "myName";
        boolean isContains_A= txt.contains("a");
        System.out.println("The length of my name -> " + txt + txt.length());
        System.out.println("Does my name end with an a? " + txt + txt.lastIndexOf('a'));
        System.out.println("Does my name contain the letter a in " + txt + true);

        /**
         *
         */

        /**
         * Print the results for:
         *  1. task3-value contains "king" (ignore cases)
         *  2. index of first occurrence of "EW" (ignore cases)
         */
        String task3 = "View the lATesT neWs and BreAKINg news TodAy for U.S., WorLD, WeATheR";
        String find1 = "ew";
        System.out.println("\nDoes it contain the word king ? " + task3.contains("king"));
        System.out.println("\nWhat is the index of the first occurrence of EW? " + find1 + "is at" + task3.startsWith(find1));
        //

        /**
         * Convert the value in task4 variable into Titlecase
         *      (FirstCharacterUppercase and rest all in lowercase)
         *
         * "kINg" -> "King"
         * "QUEEN" -> "Queen"
         */
        String task4 = "kINg";
        System.out.println(task4.toUpperCase());
        System.out.println(task4.toLowerCase());

    }
}