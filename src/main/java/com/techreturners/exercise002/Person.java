package com.techreturners.exercise002;

public class Person {

        public String firstname;
        public String lastName;
        public String city;
        public int age;

        //constructor method
        public Person(String f, String l, String c, int a){
            firstname = f;
            lastName = l;
            city = c;
            age = a;
        }

        public String getFirstname() {return firstname;}

        public String getLastName() {return lastName;}

        public String getCity() {return city;}

        public int getAge() {return age;}
    }

