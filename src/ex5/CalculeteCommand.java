package ex5;
import ex2.CalSolver;
import java.util.List;
/**
 * Команда для виконання обчислень.
 */
class CalculateCommand implements Command {
    private CalSolver solver;
    private int number;

    public CalculateCommand(CalSolver solver, int number) {
        this.solver = solver;
        this.number = number;
    }

    @Override
    public void execute() {
        solver.addCalculation(number);
    }

    @Override
    public void undo() {
        List<?> results = solver.getResults();
        if (!results.isEmpty()) {
            results.remove(results.size() - 1);
        }
    }
}
