package ex2;

import java.util.ArrayList;
import java.util.List;
/**
 * Клас для обчислення чергувань і збереження результатів у колекції.
 */
public class CalSolver {
    private List<CalData> results = new ArrayList<>();

    /**
     * Додає новий результат у колекцію.
     *
     * @param number число для аналізу
     */
    public void addCalculation(int number) {
        results.add(new CalData(number));
    }

    /**
     * Повертає всі результати.
     *
     * @return список об'єктів CalData
     */
    public List<CalData> getResults() {
        return results;
    }
}
