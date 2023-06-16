package model;

import java.util.Scanner;

public class Numbers {
    public double number1;
    public double number2;
    public double number3;
    public double number4;

    // То есть у нас будет 2 комплексных числа:
    // number1 + number2 * i и number3 + number4 * i
    // потому что комплексное число задается просто парой вещественных числе

    public Numbers(double number1, double number2, double number3, double number4) {
        this.number1 = number1;
        this.number2 = number2;
        this.number3 = number3;
        this.number4 = number4;
    }

    public double getNumber1() {
        return number1;
    }

    public double getNumber2() {
        return number2;
    }

    public double getNumber3() {
        return number3;
    }

    public double getNumber4() {
        return number4;
    }

    public static double setAfor1() {
        System.out.println("Введите действительную часть первого числа?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double setBfor1() {
        System.out.println("Введите мнимую часть первого числа?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double setAfor2() {
        System.out.println("Введите действительную часть второго числа?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public static double setBfor2() {
        System.out.println("Введите мнимую часть второго числа?");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    public void setNumber1(double number1) {
        this.number1 = number1;
    }

    public void setNumber2(double number2) {
        this.number2 = number2;
    }

    public void setNumber3(double number3) {
        this.number3 = number3;
    }

    public void setNumber4(double number4) {
        this.number4 = number4;
    }

}
