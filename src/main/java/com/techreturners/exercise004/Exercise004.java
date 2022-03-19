package com.techreturners.exercise004;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Exercise004 {

    //Declare number of giga seconds as a constant
    final int GIGASECONDS = 1000000000;

// Instantiate and initialise a member variable for the initial date

    LocalDateTime initialDate = LocalDateTime.now();


    public Exercise004(LocalDate date) {

        //Assign input date to the class member variable and convert to datetime

        initialDate =  date.atStartOfDay();

    }

    public Exercise004(LocalDateTime dateTime) {

        //Assign input date and time to the class member variable

        initialDate = dateTime;

    }

    public LocalDateTime getDateTime() {

        //  Calculate future date

      return    initialDate.plus(GIGASECONDS, ChronoUnit.SECONDS);

    }
}
