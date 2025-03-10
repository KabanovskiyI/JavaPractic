package ex6;

import ex2.CalData;
import ex2.CalSolver;
import ex3.Result;
import ex3.Text;
import java.util.*;
import java.util.function.Predicate;
import ex5.CommandManager;
import ex5.CalculateCommand;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CalSolver solver = new CalSolver();
        CommandManager manager = CommandManager.getInstance();
        Result displayer = new Text();
        TaskQueue taskQueue = new TaskQueue(4);

        List<CalData> results = new ArrayList<>();

        while (true) {
            System.out.println("Оберіть дію: 1 - Обчислити, 2 - Паралельна обробка, 3 - Відмінити, 4 - Вийти");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Введіть число: ");
                    int number = scanner.nextInt();
                    CalculateCommand command = new CalculateCommand(solver, number);
                    manager.executeCommand(command);
                    solver.addCalculation(number);
                    results.addAll(solver.getResults());
                    break;
                case 2:
                    ParallelProcessor processor = new ParallelProcessor(results);
                    taskQueue.submitTask(() -> System.out.println("Мінімум: " + processor.findMin()));
                    taskQueue.submitTask(() -> System.out.println("Максимум: " + processor.findMax()));
                    taskQueue.submitTask(() -> System.out.println("Середнє: " + processor.calculateAverage()));
                    taskQueue.submitTask(() -> System.out.println("Фільтр (>10): " + processor.filterByCriteria(10)));
                    break;
                case 3:
                    manager.undo();
                    break;
                case 4:
                    System.out.println("Вихід...");
                    taskQueue.shutdown();
                    return;
                default:
                    System.out.println("Невірний вибір");
            }
        }
    }
}