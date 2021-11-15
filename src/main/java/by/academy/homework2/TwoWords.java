package by.academy.homework2;

import java.util.Scanner;

public class TwoWords {
    public static void main(String[] args) {


        {

            Scanner sc = new Scanner(System.in);
            System.out.println("Введите любое слово или фразу: ");
            String word1 = sc.nextLine();
            Scanner sca = new Scanner(System.in);
            System.out.println("Введите любое слово или фразу: ");
            String word2 = sc.nextLine();
            String word3 = (word1.substring(0, word1.length() / 2)) +
                    (word2.substring(word2.length() / 2, word2.length()));
            System.out.println(word3);

        }
    }
}