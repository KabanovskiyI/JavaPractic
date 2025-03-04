package ex2;
import java.io.*;
/**
 * Клас для демонстрації серіалізації та десеріалізації.
 * Використовує Serializable.
 */
public class CalStorege {
    private static final String FILE_NAME = "calculation_data.ser";
    /**
     * Зберігає об'єкт у файл.
     * @param data Об'єкт для серіалізації
     */
    public static void save(CalData data) {
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(FILE_NAME))) {
            oos.writeObject(data);
            System.out.println("Об'єкт збережено у файл.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /**
     * Відновлює об'єкт із файлу.
     * @return Відновлений об'єкт CalculationData або null у разі помилки
     */
    public static CalData load() {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(FILE_NAME))) {
            return (CalData) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
            return null;
        }
    }
}
