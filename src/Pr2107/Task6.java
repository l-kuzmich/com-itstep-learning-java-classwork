package Pr2107;

/*Создать двумерных массив из 8 строк по 5 столбцов в каждой из случайных целых чисел из отрезка [10; 99]
* Вывести массив на экран*/

import java.util.Random;

public class Task6 {

    public void displayArray(int[][] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Task6 obj = new Task6();
        Random random = new Random();

        int [][] arrayOfNumbers = new int[8][5];

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            for (int j = 0; j < arrayOfNumbers[i].length; j++) {
                arrayOfNumbers[i][j] = random.nextInt(99 - 10) + 10;
            }
        }

        obj.displayArray(arrayOfNumbers);
    }
}
