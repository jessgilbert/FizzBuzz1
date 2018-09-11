package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here

        for (Integer i = 0; i <= 100; i = i + 1) {

            String x = calculateFizzBuzzForNumber(i);

            if (i % 11 == 0) {
                System.out.println("Bong");
            }
            else if (i % 15 == 0) {
                //If number is factor of 3 and 5
                System.out.println("FizzBuzz");
                //Print 'FizzBuzz'
            }
            else if (i % 13 == 0) {
                System.out.println("Fezz");
            }
            else if (i % 35 == 0) {
                //If number factor of 7 and 5
                System.out.println("BuzzBang");
                //Print BuzzBang

            }
            else if (i % 21 == 0) {
                //If number factor of 3 and 7
                System.out.println("FizzBang");
                //Print 'FizzBang'
            }
            else if (i % 3 == 0) {
                //If number is factor of 3
                System.out.println("Fizz");
                //Print 'Fizz'
            }
            else if (i % 5 == 0) {
                //If number is factor of 5
                System.out.println("Buzz");
                //Print 'Buzz'
            }
            else if (i % 7 == 0) {
                //If number is factor of 7
                System.out.println("Bang");
                //Print 'Bang'


            }
            else {
                System.out.println(String.valueOf(i));
                //Print i (Number 1 to 100) using numbers if not otherwise specified
            }

        }

    }

    private static String calculateFizzBuzzForNumber(Integer i) {
        String result = "";

        if (i % 3 == 0) {
            result = result + "Fizz";
        }

        if (i % 5 == 0) {
            result = result + "Buzz";
        }
        if (i % 7 == 0) {
            result = result + "Bang";
        }
        if (i % 11 == 0) {
            result = result + "Bong";
        }
        if (i % 13 == 0) {
            result = result + "Fezz";
        }


        return result;
    }


}
