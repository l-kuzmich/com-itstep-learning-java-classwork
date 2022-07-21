package Pr2107;

/*Создайте массив из 8 случайных целых чисел из отрезка [1; 10]
* Выведите массив на экран
* Замените каждый элемент с нечетным индексом на ноль
* Снова выведите массив на экран отдельной строкой*/

import java.util.Random;

public class Task3 {

    public void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public void changeArray(int[] a) {

        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                a[i] = 0;
            }
        }
        System.out.println();
    }


    public static void main(String[] args) {
        Task3 obj = new Task3();
        int[] arrayOfNumbers = new int[8];

        Random random = new Random();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(10 - 1) + 1;
        }

        obj.displayArray(arrayOfNumbers);
        obj.changeArray(arrayOfNumbers);
        obj.displayArray(arrayOfNumbers);

    }
}
