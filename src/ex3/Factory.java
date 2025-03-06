package ex3;
import ex4.Table;
/**
 * Фабрика для створення об'єктів Result.
 */
public abstract class Factory {
        /**
     * Метод для створення конкретного об'єкта Result.
     *
     * @return об'єкт Result
     */
    public abstract Result createDisplayer();
}
