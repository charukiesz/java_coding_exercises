package com.techreturners.exercise003;

public class Exercise003 {

    private String[] iceCreams = {"Pistachio", "Raspberry Ripple", "Vanilla", "Mint Chocolate Chip", "Chocolate", "Mango Sorbet"};

    int getIceCreamCode(String iceCreamFlavour) {
        int i = 0;

        int len = iceCreams.length;

        while (i < len) {
            if (iceCreams[i].equals(iceCreamFlavour)) {
                return i;
            }
            i++;
        }
          return i;
    }

    String[] iceCreamFlavours() {

        return iceCreams;
    }

}
