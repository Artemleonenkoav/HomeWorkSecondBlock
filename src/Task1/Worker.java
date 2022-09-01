//Описать класс с именем Worker, содержащую следующие поля:
//         фамилия и инициалы работника;
//         зарплату
//        Написать программу, выполняющую следующие действия:
//         ввод с клавиатуры данных в массив, состоящий из пяти элементов типа Worker 
//         если значение зарплаты введено не в соответствующем формате выдает исключение.
//         вывод на экран фамилии работника, стаж работы которого превышает введенное значение.

package Task1;

import java.util.Arrays;
import java.util.Scanner;

public class Worker {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int personCount = 5;
        String[] person = new String[personCount];
        int[] workerPerson = new int[personCount];
        for (int i = 0; i < person.length; i++) {
            System.out.println("Input Surname ");
            person[i] = scanner.next();
        }
        // Exception in thread "main" java.util.InputMismatchException
        try {
            for (int i = 0; i < workerPerson.length; i++) {
                System.out.println("Input salary for " + person[i] + " : ");
                workerPerson[i] = scanner.nextInt();
            }
        } catch (Exception e) {
            System.out.println("STOOOP , you need write number, it's not  work  ");
        }
        System.out.println(Arrays.toString(person));
        System.out.println(Arrays.toString(workerPerson));
    }
}
