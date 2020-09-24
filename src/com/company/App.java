package com.company;

import java.util.Scanner;

class App {
    public void run() {
        System.out.println("--- Работа со строкой ---");
        System.out.println("--------------------------------");
        System.out.print("Введите исходный текст: ");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("--------------------------------");
        System.out.println("Задачи:");
        System.out.println("0. Выйти из программы");
        System.out.println("1. Узнать количество симолов");
        System.out.println("2. Заменить искомую строку на другую");
        System.out.println("3. Удалить все теги из html документа");
        System.out.println("4. Удалить конкретный тег из html документа");
        System.out.println("Выберите задачу");
        String task = scanner.nextLine();
        switch (task) {
            case "0":
                System.out.println("Выбрана задача 0");
                break;
            case "1":
                System.out.println("1. Узнать количество симолов");
                System.out.println("--------------------------------");
                System.out.println("В строке " + str.length() + " символов");
                System.out.println("букв: " + this.getCountLetters(str));
                break;
            case "2":
                System.out.println("2. Удалить указанную подстроку");
                System.out.println("--------------------------------");

            case "3":
                System.out.println("3. Засенить указанную посдтроку на другую");

                break;
            case "4":
                System.out.println("Выбрана задача 4");
                break;

            default:
                System.out.println("Такой задачи нет");


        }
        System.out.println("--- конец программы ---");
    }

    private int getCountLetters(String str) {
        char[] chStr = str.toCharArray();
        int n = 0;
        for (int i = 0; i < chStr.length; i++) {
            if (!(chStr[i] == ' ' && chStr[i] == ','
                    && chStr[i] == '.' && chStr[i] == ':'
                    && chStr[i] == ';')) {
                n++;
            }
        }
        return n;
    }
}
