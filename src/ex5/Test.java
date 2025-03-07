package ex5;
import ex2.CalData;
/**
 * Клас для тестування інтерфейсу.
 */
import ex2.CalSolver;
import ex3.Result;
import ex3.Text;
import ex4.Table;

import java.util.List;
import java.util.Scanner;


public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalSolver solver = new CalSolver();
        CommandManager manager = CommandManager.getInstance();
        Result displayer = new ex3.Text();

        while (true) {
            System.out.println("Оберіть дію: 1 - Обчислити, 2 - Відмінити, 3 - Показати результати, 4 - Вийти");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Введіть число: ");
                    int number = scanner.nextInt();
                    manager.executeCommand(new CalculateCommand(solver, number));
                    break;
                case 2:
                    manager.undo();
                    break;
                case 3:
                    System.out.print("Оберіть формат виведення (1 - Таблиця, 2 - Текст): ");
                    int formatChoice = scanner.nextInt();
                    scanner.nextLine(); // очищаємо буфер

                    List<CalData> results = solver.getResults(); // Отримуємо список результатів

                    if (results.isEmpty()) {
                        System.out.println("Немає результатів для виведення.");
                        break;
                    }

                    if (formatChoice == 1) {
                        System.out.print("Введіть формат рядка таблиці (наприклад: %-10d || %-10d || %-10s): ");
                        String rowFormat = scanner.nextLine();
                        Table tableFormat = new Table("Число  | Чередування | Бінарне подання", rowFormat);
                        tableFormat.display(results);
                    } else {
                        displayer.display(results);
                    }
                    break;
                case 4:
                    System.out.println("Вихід...");
                    return;
                default:
                    System.out.println("Невірне число");
            }
        }
    }
}