package com.example.logic;

import static java.lang.Math.*;

public class MathQuiz {

    public boolean question1(double quest1) {
        if (quest1 == 15) {
            System.out.println("true");
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean question2(double quest2) {
        if (quest2 == 144) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }

    public boolean question3(double quest3) {
        if (quest3 == 123) {
            System.out.println(true);
            return true;
        } else {
            System.out.println(false);
            return false;
        }
    }


    public int countAnswers(boolean a, boolean b, boolean c ){
        int counter = 0;

        if (a) {
            counter++;
        }

        if (b) {
            counter++;
        }

        if (c) {
            counter++;
        }
        return counter;
    }

}