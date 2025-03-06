package ex2;

import java.util.Scanner;
/**
 * Клас для тестування коректності результатів обчислень та серіалізації.
 */
/** 
public class CalTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Введіть число: ");
        int number = scanner.nextInt();

        CalSolver solver = new CalSolver(number);
        CalData result = solver.getResult();
        System.out.println("Результат обчислення: " + result);

        CalStorege.save(result);

        CalData loadedResult = CalStorege.load();
        System.out.println("Відновлений об'єкт: " + loadedResult);

        scanner.close();
    }
}
    */
