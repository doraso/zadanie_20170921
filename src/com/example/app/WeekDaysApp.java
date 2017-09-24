package com.example.app;

import com.example.logic.WeekDays;

import java.util.Scanner;

public class WeekDaysApp {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj numer dnia tygodnia: ");
        int DayWeek = input.nextInt();
        input.close();
        WeekDays day = new WeekDays();
        day.dayName(DayWeek);
        day.dayWorkOrWknd(DayWeek);

    }
}


