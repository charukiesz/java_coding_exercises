package com.techreturners.exercise001;

import java.util.List;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        String stringFirst = firstName;
        String stringLast = lastName;
        String stringInitials = stringFirst.charAt(0)  + "." + stringLast.charAt(0);

        return stringInitials;
    }

    public double addVat(double originalPrice, double vatRate) {
        // Add your code here
        Double price = originalPrice;
        Double vat = (price * (vatRate/100));
        Double priceWithVat =  0.0; // (originalPrice + vat);

        If (vatRate == 0.0){
            priceWithVat = originalPrice;
        }else{
            priceWithVat = (originalPrice + vat);
        }
        return priceWithVat;


    public String reverse(String sentence) {
        // Add your code here
            
        return "";
    }

    public int countLinuxUsers(List<User> users) {
        // Add your code here
        return 0;
    }
}
