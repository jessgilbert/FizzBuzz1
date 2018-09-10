package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (Integer i = 0; i <= 100; i++) {

            if (i % 15 == 0) {
                //If number is factor of 3 and 5
                System.out.println("FizzBuzz");
                //Print 'FizzBuzz'
            } else if (i % 35 == 0) {
                //If number factor of 7 and 5
                System.out.println("BuzzBang");
                //Print BuzzBang

            } else if (i % 21 == 0) {
                //If number factor of 3 and 7
                System.out.println("FizzBang");
                //Print 'FizzBang'
            } else if (i % 3 == 0) {
                //If number is factor of 3
                System.out.println("Fizz");
                //Print 'Fizz'
            } else if (i % 5 == 0) {
                //If number is factor of 5
                System.out.println("Buzz");
                //Print 'Buzz'
            } else if (i % 7 ==0) {
                //If number is factor of 7
                System.out.println("Bang");
                //Print 'Bang'


            } else {
                System.out.println(String.valueOf(i));
                //Print i (Number 1 to 100) using numbers if not otherwise specified
            }

        }

    }
}
