package ru.netology.sqr;

public class SQRService {

    public int calcSqr(int number1, int number2) {
        int x;
        x = 0;
        for (int i = 10; i <= 99; i++) {
            if (i * i >= number1) {
                if (i * i > number2) {
                    x++;
                }
            }
        }
        return x;
    }
}


