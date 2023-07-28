package ru.job4j.calculator;

public class MathCalculator {
    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double diffandDivide(double first, double second) {
        return ru.job4j.math.MathFunction.difference(first, second)
                + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static  double allOperation(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.difference(first, second)
                + ru.job4j.math.MathFunction.divide(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен: " + diffandDivide(50, 10));
        System.out.println("Результат расчета равен: " + allOperation(30, 10));
    }
}
