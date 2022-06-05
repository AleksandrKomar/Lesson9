package hometasks.task2;

import java.util.Scanner;

public class CustomerArray {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Введите размер массива: ");
        int sizeI = input.nextInt();

        if (sizeI <= 0) {
            return;
        }

        int[] arr = new int[sizeI];

        for (int i = 0; i < sizeI; i++) {
            arr[i] = i * 3 + 1;
        }

        int min = arr[0];
        int max = arr[0];
        int summ = 0;

        if (arr.length > 0) {
            System.out.print("Нечетные значения массива - ");
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

            if (arr[i] > max) {
                max = arr[i];
            }

            summ += arr[i];

            if (arr[i] % 2 != 0) {
                System.out.print(arr[i] + ", ");
            }
        }

        System.out.println("\nНаибольшее значение массива - " + max);
        System.out.println("Наименьшее значение массива - " + min);
        System.out.println("Общая сумма элементвов - " + summ);
        System.out.printf("Среднее арифметическое - %.2f", (double) summ / arr.length);

    }
}