package com.company;

public class Main {

    public static void main(String[] args) {
        // write your code here
//      // Home work_1j
        String nameOfProgrammer; //01
        final int NUM = 73; //02
        String word = "Hi!"; //03
        nameOfProgrammer = NUM + word; //04
        System.out.println(NUM + word + nameOfProgrammer); //05

        if (NUM < 0) { //06
            System.out.println("Vy sohranili otricatelnoe chislo!");
        } else if (NUM > 0) {
            System.out.println("Vy sohranili polojitelnoe chislo");
        } else {
            System.out.println("Vy sohranili nul");
        }
    }
}
