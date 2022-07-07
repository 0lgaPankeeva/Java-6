package ru.netology.sqr.java6.services;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvSource({
            "400,500",
            "600,700"
    })

    public int calcSqr(int number1, int number2) {

        SqrService service = new SqrService();
        int actual = calcSqr (int number1,int number2);

        Assertionce.asserEquals(actual);

    }
}
