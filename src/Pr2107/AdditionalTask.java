package Pr2107;

import java.util.Scanner;

public class AdditionalTask {

    static AdditionalTask obj = new AdditionalTask();

    public int sum (int a, int b){
        return a + b;
    }

    public int sub (int a, int b){
        return a - b;
    }

    public int mul (int a, int b){
        return a * b;
    }

    public int div (int a, int b){
        return a / b;
    }

    public void calculation (int a, int b, String o){

        switch (o){
            case "+" : {
                System.out.print(a + " + " + b + " = " + obj.sum(a,b));
                break;
            }
            case "-" : {
                System.out.print(a + " - " + b + " = " + obj.sub(a,b));
                break;
            }
            case "*" : {
                System.out.print(a + " * " + b + " = " + obj.mul(a,b));
                break;
            }
            case "/" : {
                System.out.print(a + " / " + b + " = " + obj.div(a,b));
                break;
            }
            default:
                System.out.println("Wrong operation");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to calculator");

        while (true){
            System.out.println("Input two numbers");
            int firstNumber = sc.nextInt();
            int secondNumber = sc.nextInt();
            System.out.println("Choose the operation (+, -, *, /)");
            String operation = sc.next();

            obj.calculation(firstNumber,secondNumber,operation);

            System.out.println("\nDo you want to continue? (y/n)");
            String con = sc.next();
            if (con.equals("n")){
                break;
            }
        }
    }
}
