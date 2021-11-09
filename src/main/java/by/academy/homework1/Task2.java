package by.academy.homework1;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите тип данных");
        String name = scan.nextLine();

        switch (name) {

            case "int":
                System.out.println("Введите число");
                int a1 = scan.nextInt();
                System.out.println("Остаток от деления на 2 равняется " + a1 % 2);
                break;
            case "double":
                System.out.println("Введите число");
                double a2 = scan.nextDouble();
                System.out.println("70% от введенного числа равняется " + a2 * 0.7);
                break;
            case "float":
                System.out.println("Введите число");
                float a3 = scan.nextFloat();
                System.out.println("Квадрат числа равняется " + Math.pow(a3, 2));
                break;
            case "char":
                System.out.println("Введите символ");
                char a4 = scan.next().charAt(0);
                System.out.println("Код символа " + (int) a4);
                break;
            case "String":
                System.out.println("Введите данные");
                String a5 = scan.nextLine();
                System.out.println("Hello " + a5);
                break;
            default:
                System.out.println("Unsupported type");
                break;
        }
        scan.close();
    }
}


