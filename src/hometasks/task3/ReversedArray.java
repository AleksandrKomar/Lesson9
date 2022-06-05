package hometasks.task3;

public class ReversedArray {

    static int[] temp;

    public static void main(String[] args) {

        int[] arr = {1, 8, 6, 7, 3, 66, 98, 44, 125};
        myReverse(arr);

        System.out.print("Инвертированный массив - ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ", ");
        }

        temp = subArray(arr, 4, 8);

        System.out.print("\nЗначения массива по счетчику - ");
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i] + ", ");
        }

    }

    static void myReverse(int[] array) {

        temp = new int[array.length];

        int j = 0;
        for (int i = array.length - 1; i >= 0; i--) {
            temp[j] = array[i];
            j++;
        }
    }

    static int[] subArray(int[] array, int index, int count) {

        int[] tmp = new int[count];

        int j = 0;

        boolean vseOk = false;

        for (int i = index; i < count; i++) {
            if (i <= ((array.length - index) + 1) && !vseOk) {
                tmp[j] = array[i];
            } else {

                if (!vseOk) {
                    vseOk = true;
                    i -= index;
                }
                tmp[j] = 1;
            }
            j++;
        }
        return tmp;
    }
}
