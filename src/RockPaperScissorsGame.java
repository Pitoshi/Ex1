import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int userScore = 0;
        int computerScore = 0;

        System.out.println("Добро пожаловать в игру Камень-Ножницы-Бумага!");

        for (int round = 1; round <= 5; round++) {
            System.out.println("Раунд " + round + ": введите K (камень), N (ножницы) или B (бумага): ");
            String userChoice = scanner.next().toUpperCase();

            // Генерируем случайный выбор компьютера
            String[] choices = {"K", "N", "B"};
            String computerChoice = choices[random.nextInt(3)];

            System.out.println("Выбор компьютера: " + computerChoice);

            // Определяем победителя раунда и начисляем баллы
            if (userChoice.equals("K")) {
                if (computerChoice.equals("N")) {
                    System.out.println("Вы победили в этом раунде!");
                    userScore += 1;
                } else if (computerChoice.equals("B")) {
                    System.out.println("Компьютер победил в этом раунде!");
                    computerScore += 5;
                } else {
                    System.out.println("Ничья в этом раунде!");
                }
            } else if (userChoice.equals("N")) {
                if (computerChoice.equals("B")) {
                    System.out.println("Вы победили в этом раунде!");
                    userScore += 2;
                } else if (computerChoice.equals("K")) {
                    System.out.println("Компьютер победил в этом раунде!");
                    computerScore += 1;
                } else {
                    System.out.println("Ничья в этом раунде!");
                }
            } else if (userChoice.equals("B")) {
                if (computerChoice.equals("K")) {
                    System.out.println("Вы победили в этом раунде!");
                    userScore += 5;
                } else if (computerChoice.equals("N")) {
                    System.out.println("Компьютер победил в этом раунде!");
                    computerScore += 2;
                } else {
                    System.out.println("Ничья в этом раунде!");
                }
            } else {
                System.out.println("Неверный ввод! Попробуйте еще раз.");
                round--; // Возврат к текущему раунду
                continue;
            }
        }

        // Выводим итоговый счет и объявляем победителя
        System.out.println("Игра окончена! Счет:");
        System.out.println("Ваш счет: " + userScore);
        System.out.println("Счет компьютера: " + computerScore);

        if (userScore > computerScore) {
            System.out.println("Вы победили!");
        } else if (userScore < computerScore) {
            System.out.println("Компьютер победил!");
        } else {
            System.out.println("Ничья!");
        }

        scanner.close();
    }
}