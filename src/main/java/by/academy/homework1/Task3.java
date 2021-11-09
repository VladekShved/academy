package by.academy.homework1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int num;
        int factor;
        Scanner scan = new Scanner(System.in);
        System.out.println("Введите число от 1 до 10");
        scan.hasNextInt();
        num = scan.nextInt();
        if (num >= 1 && num <= 10){
            for (int i=1; i<=10; i++){
factor = i * num;
System.out.println(factor);
            }
        } else{
            System.out.println("Вы ввели неправильное число");
        }
        scan.close();
    }
}
