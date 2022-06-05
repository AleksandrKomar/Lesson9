package hometasks.task4;

public class UserArray {
    public static void main(String[] args) {

        int[] myArray = new int[]{4, 7, 4, 8, 6, 1, 4, 3, 3};

        int[] arr = insert(myArray, 99);

        System.out.print("Массив увеличенный на 1 элемент - ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }

    }


    static int[] insert(int[] array, int value) {

        int[] temp = new int[array.length + 1];

        for (int i = 0; i < temp.length; i++) {
            if (i == 0) {
                temp[i] = value;
                continue;
            }
            temp[i] = array[i - 1];
        }
        return temp;
    }

}
