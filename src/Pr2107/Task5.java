package Pr2107;

/*Пользователь должен ввести с клавиатуры размер массива - натуральное число больше n = 3
* если пользователь ввел не подходящее число, то программа должна просить пользователя повторить ввод
* Создать массив из n случайных целых чисел из отрезка [0, n] и вывести его на экран
* Создать второй массив только из четных элементов первого массива, если они там есть и вывести его на экран*/

import java.util.Random;
import java.util.Scanner;

public class Task5 {
    public void displayArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
    }

    public int evenNumbers (int [] a){
        int count = 0;

        for (int i = 0; i < a.length; i++) {
            if(a[i] % 2 == 0){
                count++;
            }
        }
        return count;
    }


    public static void main(String[] args) {
        Task5 obj = new Task5();

        Scanner sc = new Scanner(System.in);
        System.out.println("Input length of array");
        int n;

        while(true) {
            n = sc.nextInt();
            if (n > 3) {
                break;
            } else System.out.println("Repeat the input");
        }

        int[] arrayOfNumbers = new int[n];

        Random random = new Random();

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            arrayOfNumbers[i] = random.nextInt(n);
        }

        obj.displayArray(arrayOfNumbers);

        int [] arrayOfEvenNumbers = new int[obj.evenNumbers(arrayOfNumbers)];

        int j = 0;

        for (int i = 0; i < arrayOfNumbers.length; i++) {
            if (arrayOfNumbers[i] % 2 == 0) {
                arrayOfEvenNumbers[j] = arrayOfNumbers[i];
                j++;
            }
        }
        obj.displayArray(arrayOfEvenNumbers);
    }
}
