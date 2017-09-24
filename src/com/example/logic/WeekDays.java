package com.example.logic;

public class WeekDays {

    public void dayName(int DayNumber) {

        switch (DayNumber) {
            case 1:
                System.out.println("Podany numer dnia tygodnia 1: Poniedziałek");
                break;
            case 2:
                System.out.println("Podany numer dnia tygodnia 2: Wtorek");
                break;
            case 3:
                System.out.println("Podany numer dnia tygodnia 3: Sroda");
                break;
            case 4:
                System.out.println("Podany numer dnia tygodnia 4: Czwartek");
                break;
            case 5:
                System.out.println("Podany numer dnia tygodnia 5: Piątek");
                break;
            case 6:
                System.out.println("Podany numer dnia tygodnia 6: Sobota");
                break;
            case 7:
                System.out.println("Podany numer dnia tygodnia 7: Niedziela");
                break;
            default:
                System.out.println("Podano niepoprawny numer");
        }
    }
    public void dayWorkOrWknd(int DayNumber){
        if (DayNumber>0 && DayNumber<=5) {
            System.out.println("To jest dzień pracujący");
        }
        else if (DayNumber>=6 && DayNumber<=7){
            System.out.println("To jest weekend");
        }
    }
}

