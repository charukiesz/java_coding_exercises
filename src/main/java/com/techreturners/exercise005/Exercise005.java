package com.techreturners.exercise005;

import java.util.Locale;

public class Exercise005 {
//Instantiate private member variable alphabet string
    private static String alphabet = "abcdefghijklmnopqrstuvwxyz";

    public boolean isPangram(String input) {


        input = input.toLowerCase();  // Convert input string to lowercase
        int len = input.length();     //length of input string
        boolean isMatched = true;    //Declare and initialise boolean variable for a match

        if (input == "") {          //Check if input string is empty, if so return false
            return false;
        }
        for (int i = 0; i < alphabet.length(); i++) {   //Iterate through the alphabet string

            isMatched = false;                          // set match to false
            for (int j = 0; j < len; j++) {             //Iterate through each character in the input sentence
                if (input.charAt(j) < 97 || input.charAt(j) > 122) // Check if character in the input sentence is in lowercase a to z ASCII set
                    continue;                                      // If so, continue on
                if (alphabet.charAt(i) == input.charAt(j)) {    //Check if alphabet character is the same as character in input sentence
                    isMatched = true;                           //If they match break out of this loop and repeat outer loop for next alphabet character
                    break;
                }
            }
            if (!isMatched)                              //If alphabet character and input character do not match
                return isMatched;                       // Return false(i.e. the initialised value of isMatched variable)
        } return isMatched;                         // Return false (i.e. the initialised value of the isMatched variable)
    }
}
