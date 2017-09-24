package com.example.app;

import com.example.logic.MathQuiz;

import java.util.Scanner;

public class MathQuizVerification {
    public static void main(String[] args) {
        System.out.println("Podaj wynik mnożenia 3*5");
        Scanner input = new Scanner(System.in);
        double quest1 = input.nextDouble();
        MathQuiz quiz = new MathQuiz();
        boolean answer1 = quiz.question1(quest1);
        System.out.println("Podaj pole kwadratu o boku 12: ");
        double quest2 = input.nextDouble();
        boolean answer2 = quiz.question2(quest2);
        System.out.println("Podaj pierwiastek kwadratowy z liczby 15129: ");
        double quest3 = input.nextDouble();
        boolean answer3 = quiz.question3(quest3);
        System.out.println("Liczba poprawnych odpowiedzi wynosi: " + quiz.countAnswers(answer1, answer2, answer3));

    }
}
