package com.techreturners.exercise003;

public class Exercise003 {

    private String[] iceCreams = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        int i = 0;

        int len = iceCreams.length;

        while (i < len) {
            if (iceCreams[i] == iceCreamFlavour) {
                return i;
            }
            i++;
        }
        throw new UnsupportedOperationException("IceCreamCode not found.");

    }

    String[] iceCreamFlavours() {


            return iceCreams;
        // Exception throw not needed as iceCream array is always populated
         //  throw new UnsupportedOperationException("Icecream flavours not found.");

    }

}
