/* Program: Day of the Week Calculator
   Eastern Oregon University
   CS 210 Homework 7
*/

import java.util.Scanner;

public class Exercise3_5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter today's day of the week (0 to 6): ");
        int currentDay = input.nextInt();

        System.out.print("Enter the number of days elapsed since today: ");
        int daysElapsed = input.nextInt();
        // adds input, divides by 7 (days of week) and result is the remainder
        int futureDay = (currentDay + daysElapsed) % 7 ;
        // empty strings
        String currentDayText = "";
        String futureDayText = "";
        //switch statements to get the user input from int to strings
        switch (currentDay){
            case 0:
                currentDayText = "Sunday"; break;
            case 1:
                currentDayText ="Monday"; break;
            case 2:
                currentDayText="Tuesday"; break;
            case 3:
                currentDayText ="Wednesday"; break;
            case 4:
                currentDayText ="Thursday"; break;
            case 5:
                currentDayText ="Friday"; break;
            case 6:
                currentDayText ="Saturday"; break;
        }
        switch (futureDay){
            case 0:
            futureDayText = "Sunday"; break;
            case 1:
            futureDayText ="Monday"; break;
            case 2:
            futureDayText ="Tuesday"; break;
            case 3:
            futureDayText ="Wednesday"; break;
            case 4:
            futureDayText ="Thursday"; break;
            case 5:
            futureDayText ="Friday"; break;
            case 6:
            futureDayText ="Saturday"; break;
         }
            System.out.print("Today is " + currentDayText + " and the future day is " + futureDayText);
        }
    }




