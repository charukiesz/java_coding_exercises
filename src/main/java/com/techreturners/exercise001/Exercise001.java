package com.techreturners.exercise001;

import java.text.DecimalFormat;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class Exercise001 {
    public String capitalizeWord(String word) {
        // Add your code here
        return Character.toUpperCase(word.charAt(0)) + word.substring(1);
    }

    public String generateInitials(String firstName, String lastName) {
        // Add your code here
        return firstName.charAt(0) + "." + lastName.charAt(0);
    }

   public double addVat(double originalPrice, double vatRate) {
       // Add your code here
       Double vat = (originalPrice * (vatRate / 100));
       DecimalFormat df = new DecimalFormat("0.00");

       if (vatRate == 0.0) {
           return originalPrice;
       } else {

           return Double.valueOf(df.format((originalPrice + vat)));

       }
   }



    public String reverse(String sentence) {
        // get string length
        int n = sentence.length();

        // create a character array of the same size as that of string
        char[] temp = new char[n];

        // fill character array backward with characters in the string
        for (int i = 0; i < n; i++) {
            temp[n - i - 1] = sentence.charAt(i);
        }

        // convert character array to string and return it
        return String.copyValueOf(temp);
    }

        public int countLinuxUsers(List<User> users) {
        // Add your code here
            AtomicInteger count = new AtomicInteger();
;
            users.forEach(user ->
            {
                if (user.getType() == "Linux")
                    count.getAndIncrement();
            });


            return count.get();
    }
}
