package com.example.bmimodel;

import org.junit.Test;

public class BMIModelTest{
    @Test
    public void getBMITest() {
        double w, h;
        System.out.println("Testing BMI.getBMI");

        w = 90;
        h = 1.8;
        System.out.println(w + ", " + h);
        System.out.println(BMIModel.getBMI(w, h));
    }
    public static double random(){
        double h;
        h = 0.5 + 2.5 * Math.random();
        return h;
    }
    @Test
    public void toDoubleTest(){
        System.out.println("Testing BMI.toDouble");
        String h = "2";
        System.out.println(h);
        System.out.println(BMIModel.toDouble(h));
        System.out.println(BMIModelTest.random());
    }
    @Test
    public void formatBMI(){
        System.out.println("Testing BMI.formatBMI");
        double bmi = 2.0;
        System.out.println(+ bmi);
        System.out.println(BMIModel.formatBMI(bmi));
        System.out.println(BMIModelTest.random());
    }
}