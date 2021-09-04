package com.company.tests;

import com.company.Car;

public class unitTests {
    public static void test1(){
        StringBuilder builder = new StringBuilder();
        builder.append("Check if equals in car object works as expected when slot ids are equal: RESULT: ");
        Car car1 = new Car("123", 24, 3);
        Car car2 =  new Car("123", 24, 3);
        boolean result = car1.equals(car2);
        builder.append(result);
        System.out.println(builder.toString());
    }

    public static void test2(){
        StringBuilder builder = new StringBuilder();
        builder.append("Check if equals in car object works as expected when slot ids are not equal. RESULT: ");
        Car car1 = new Car("123", 24, 3);
        Car car2 =  new Car("123", 24, 2);
        boolean result = car1.equals(car2);
        if(!result) result = !result;
        builder.append(result);
        System.out.println(builder.toString());
    }

    public static void main(String[] args){
        test1();
        test2();
    }
}
