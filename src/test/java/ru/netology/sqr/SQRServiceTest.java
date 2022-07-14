package ru.netology.sqr;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SQRServiceTest {


    @Test
    public void rangeFirst() {
        SQRService service = new SQRService();

        int actual = service.calcSqr(400, 500);
        int expected = 77;


        assertEquals(actual, expected);
    }


    @Test
    public void rangeSecond() {
        SQRService service = new SQRService();
        int actual = service.calcSqr(500, 600);
        int expected = 75;

        assertEquals(actual, expected);
    }


}


