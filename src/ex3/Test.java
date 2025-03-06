package ex3;
import java.util.Scanner;

import ex2.CalSolver;

/**
 * Головний клас для демонстрації роботи програми.
 
public class Test {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalSolver solver = new CalSolver();
        
        System.out.println("Введіть числа для обчислення (введіть -1 для завершення):");
        while (true) {
            System.out.print("Число: ");
            int num = scanner.nextInt();
            if (num == -1) break;
            solver.addCalculation(num);
        }

        // Використання фабричного методу
        Factory factory = new TextFactory();
        Result displayer = factory.createDisplayer();
        displayer.display(solver.getResults());

        scanner.close();
    }
}

*/
