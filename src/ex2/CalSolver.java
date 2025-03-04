package ex2;
/**
 * Клас для виконання обчислень.
 * Агрегує об'єкт CalculationData.
 */
public class CalSolver {
    private CalData data;
    /**
     * Конструктор класу.
     * @param number Вхідне число
     */
    public CalSolver(int number) {
        this.data = new CalData(number);
    }
    /**
     * Отримує результат обчислень.
     * @return Об'єкт CalculationData
     */
    public CalData getResult() {
        return data;
    }
}
