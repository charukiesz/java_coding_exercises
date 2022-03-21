package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise001 {
    public String capitalizeWord(String word) {

        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {

        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

   public double addVat(double originalPrice, double vatRate) {

       Double vat = (originalPrice * (vatRate / 100));
       DecimalFormat df = new DecimalFormat("0.00");

       if (vatRate == 0.0) {
           return originalPrice;
       } else {

           return Double.valueOf(df.format((originalPrice + vat)));

       }
   }



    public String reverse(String sentence) {

        StringBuilder  inputSentence = new StringBuilder(sentence); //Convert input sentence to StringBuilder object

       StringBuilder reversedSentence  = inputSentence.reverse();    //Reverse the order of the sentence

        return reversedSentence.toString();               //Convert the reversed sentence to a string object and return

    }

        public int countLinuxUsers(List<User> users) {

            AtomicInteger count = new AtomicInteger();
;
            users.forEach(user ->
            {
                if (user.getType().equals("Linux"))
                    count.getAndIncrement();
            });


            return count.get();
    }
}
