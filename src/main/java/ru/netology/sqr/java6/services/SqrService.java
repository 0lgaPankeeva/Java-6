package ru.netology.sqr.java6.services;

public class SqrService {

    public int calcSqr(int number1, int number2) {
        int x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= number1) {
                if (i * i <= number2) {
                    x = x + 1;
                    return x;
                }

            }
        }
        return x;
    }
}


