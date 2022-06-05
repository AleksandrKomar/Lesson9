package hometasks.task5;

public class Arrays {

    public static void main(String[] args) {

        int[] arr = {5, 7, 9, 12, 11, 4, 8, 1, 4, 6};

        System.out.println("Вывод элементов массива в обратном попрядке:");

        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i] + ", ");
        }

    }

}
