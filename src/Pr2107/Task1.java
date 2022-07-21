package Pr2107;

/*Написать программу, которая определит, сколько слов Вы ввели в консоли*/

import java.util.Scanner;

public class Task1 {

    public int howManyWords (String string){
        int numbersOfWords = 0;

        if (string.length() != 0){
            numbersOfWords++;
        }

        for (int i = 0; i < string.length(); i++){

            if (string.charAt(i) == ' ' && string.charAt(i + 1) != ' '){
                numbersOfWords++;
            }
        }

        return numbersOfWords;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the strings: ");

        String words = sc.nextLine();

        Task1 obj = new Task1();

        System.out.println(obj.howManyWords(words));

    }
}
