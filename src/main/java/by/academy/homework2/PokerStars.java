package by.academy.homework2;

import java.util.Scanner;

public class PokerStars {

    public static void main(String[] args) {

        int pokerCardsForPlayer = 5;
        int players = 0;

        String[] rank = {
                "2", "3", "4", "5", "6", "7", "8", "9", "10",
                "Валет", "Дама", "Король", "Туз"
        };
        String[] suits = {
                "Буби", "Черви", "Пики", "Треф"
        };

        int n = suits.length * rank.length;

        for (; ; ) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите количество игроков: ");

            if (sc.hasNextInt()) {

                players = sc.nextInt();
                if (pokerCardsForPlayer * players <= n) {
                    break;
                } else {
                    if (players == 0) {

                        System.out.println("Игра прекращена.");
                        break;

                    } else if (players < 0) {

                        System.out.println("Игроков не может быть меньше 0");

                    } else {

                        System.out.println("Перебор игроков!");
                    }
                }

            } else {
                System.out.println("Ты ввел не число");

            }
        }

        String[] deck = new String[n];
        for (int i = 0; i < rank.length; i++) {
            for (int j = 0; j < suits.length; j++) {
                deck[suits.length * i + j] = rank[i] + " " + suits[j];
            }
        }

        for (int i = 0; i < n; i++) {
            int r = i + (int) (Math.random() * (n - i));
            String temp = deck[r];
            deck[r] = deck[i];
            deck[i] = temp;
        }

        for (int i = 0; i < players * pokerCardsForPlayer; i++) {
            System.out.println(deck[i]);
            if (i % pokerCardsForPlayer == pokerCardsForPlayer - 1)
                System.out.println();
        }
    }

}
