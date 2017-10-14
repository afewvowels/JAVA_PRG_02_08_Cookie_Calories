/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_prg_02_08_cookie_calories;

import java.util.Scanner;

/**
 *
 * @author bluebackdev
 * A bag of cookies holds 40 cookies. The calorie information on the bag claims
 * that there are 10 servings in the bag and that a serving equals 300 calories.
 * Write a program that lets the user enter the number of cookies her or she
 * actually ate and then reports the number of total calories consumed.
 */
public class JAVA_PRG_02_08_Cookie_Calories {

    /**
     * This method gets user input on cookies consumed and calculates total
     * calories consumed from that number.
     */
    public static void main(String[] args) {
        // Define constants from prompt
        final int INT_COOKIES_PER_BAG = 40;
        final int INT_CALORIES_PER_SERVING = 300;
        final int INT_SERVINGS_PER_BAG = 10;
        
        // Declare variables to use in calculations
        float fltCookieCalorieRatio;
        float fltCookiesConsumed;
        float fltCaloriesTotal;
        
        // Declare string to hold user input
        String strUserInput;
        
        // Create a new scanner object to read input
        Scanner scrKeyboard = new Scanner(System.in);
        
        // Calculate calories for a single cookie, 40 cookies total,
        // 300 calories per serving and 10 servings per bag so:
        // (300 * 10) / 40 = calories / cookie
        fltCookieCalorieRatio = ((float)INT_CALORIES_PER_SERVING * (float)INT_SERVINGS_PER_BAG)
                                    / (float)INT_COOKIES_PER_BAG;
        
        // Prompt for user input
        System.out.print("Please enter the number of cookies\n" +
                            "that you ate this time: ");
        
        // Get user input
        strUserInput = scrKeyboard.nextLine();
        
        // Convert user input from string to float for calculations
        fltCookiesConsumed = Float.parseFloat(strUserInput);
        
        // Calculate total calories by multiplying cookies consumed by cookie
        // calorie ratio: cookies * (calories / cookies)
        fltCaloriesTotal = fltCookiesConsumed * fltCookieCalorieRatio;
        
        // Print result to console for user
        System.out.println("After eating " + fltCookiesConsumed + " cookies, " +
                            "you have consumed " + fltCaloriesTotal + " calories.\n");
    }
    
}
