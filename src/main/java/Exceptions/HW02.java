package Exceptions;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class HW02 {
//    Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
//    Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
    public static float inputFloat() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Введите дробное число: ");
                float input = scanner.nextFloat();
                return input;
            } catch (Exception e) {
                System.out.println("Ошибка ввода. Пожалуйста, введите дробное число.");
                scanner.next();
            }
        }
    }

//    Задание 2
    public static void Work2() {
        inputFloat();
        try {
            int[] intArray = { 2, 3, 4, 5, 6, 7, 12, 10, 11};
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);

        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }


    }
//    Задание 3
    public static void main(String[] args) throws Exception {

        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на ноль!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        }catch (Exception ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
//    Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
    public static String readStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите строку: ");
            String input = scanner.nextLine();
            if (input.isEmpty()) {
                throw new IllegalArgumentException("Нельзя вводить пустые строки!");
            } else {
                return input;
            }
        }
    }





}
