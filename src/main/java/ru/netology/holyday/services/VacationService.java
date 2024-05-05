package ru.netology.holyday.services;

public class VacationService {

    public int calculate(int income, int expenses, int threshold) {
        int count = 0; //счётчик месяцев отдыха
        int money = 0; //кол-во денег на счету

        for (int month = 0; month < 12; month++) {
            if (money > threshold) { // можем отдыхать?
                count++; //кол-во месяцев
                money = (money - expenses) / 3;
            } else {
                money = money + income - expenses;
            }
        }
        return count;
    }
}
