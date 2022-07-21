package Pr2107;

/*Создайте два массива из 5 случайных чисел из отрезка [0; 5] каждый
* Выведите массивы на экран в двух отдельных строках
* Посчитайте среднее арифметическое элементов каждого массива и сообщите, для какого из массивов
* это значение оказалось больше (или равны)*/

import java.util.Random;

public class Task4 {
    public void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public double average(int[] a){
        double average = 0;

        for (int i = 0; i < a.length; i++) {
            average += a[i];
        }
        average /= a.length;

        return average;
    }



    public static void main(String[] args) {
        Task4 obj = new Task4();
        int[] arrayOfNumbers1 = new int[5];
        int[] arrayOfNumbers2 = new int[5];

        Random random = new Random();

        for (int i = 0; i < arrayOfNumbers1.length; i++) {
            arrayOfNumbers1[i] = random.nextInt(5);
        }

        for (int i = 0; i < arrayOfNumbers2.length; i++) {
            arrayOfNumbers2[i] = random.nextInt(5);
        }

        obj.displayArray(arrayOfNumbers1);
        obj.displayArray(arrayOfNumbers2);

        if (obj.average(arrayOfNumbers1) > obj.average(arrayOfNumbers2)){
            System.out.println("Average of array 1 is bigger");
        } else if (obj.average(arrayOfNumbers1) < obj.average(arrayOfNumbers2)){
            System.out.println("Average of array 2 is bigger");
        } else System.out.println("Average is equals");
    }
}
