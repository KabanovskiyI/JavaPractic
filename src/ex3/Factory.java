package ex3;
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
/**
 * Фабрика для створення Text.
 */
class TextFactory extends Factory {
    @Override
    public Result createDisplayer() {
        return new Text();
    }
}