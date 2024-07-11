import java.util.Arrays;

public class второйэлемент {
    public static void main(String[] args) {
        int[] array = {1, 5, 7, 3, 2, 0, 4, 9, 6};
        int secondLargest = findSecondLargest(array);
        System.out.println("Второй по величине элемент: " + secondLargest);
    }

    public static int findSecondLargest(int[] array) {
        Arrays.sort(array); // Сортируем массив по возрастанию
        int n = array.length;

        if (n < 2) {
            System.out.println("В массиве меньше двух элементов");
            return -1;
        }

        int max = array[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            if (array[i] < max) {
                return array[i];
            }
        }

        System.out.println("Нет второго по величине элемента");
        return -1;
    }
}
