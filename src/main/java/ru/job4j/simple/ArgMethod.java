package ru.job4j.simple;

public class ArgMethod {
    public static void main(String[] args) {
        String name = "Job4j";
        int age = 6;
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
        ArgMethod.hello(name, age);
    }

    public static void hello(String name, int age) {
        System.out.println("Hello, " + name + ", age = " + age);
    }
}
