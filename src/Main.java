

import java.util.Scanner;
    public class Main {

        // Мальчик хочет написать на заборе признание в любви девочке из пятнадцати букв и трех пробелов.
        // На каждые три буквы мальчик тратит по 62 см длины забора, а на каждый пробел - 12 см.
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Введите длину забора в см: ");
            int length = scanner.nextInt();

            int lettersLength = 3 * 62;
            int spaceLength = 3 * 12;
            int totalLength = lettersLength + spaceLength;

            if (totalLength <= length) {
                System.out.println("Надпись мальчика поместится на заборе.");
            } else {
                System.out.println("Надпись мальчика не поместится на заборе.");
            }
        }
    }
