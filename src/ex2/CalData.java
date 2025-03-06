package ex2;
import java.io.*;

/**
 * Клас, що містить параметри та результати обчислень.
 * Реалізує Serializable для можливості серіалізації.
 */
public class CalData implements Serializable {
    private static final long serialVersionUID = 1L;
    private int number;
    private int alternations;
    /**
     * Поле, яке не серіалізується (демонстрація transient).
     */
    private transient String binaryRep;
    /**
     * Конструктор класу.
     * @param number Вхідне число
     */
    public CalData(int number) {
        this.number = number;
        comAlter();
    }
    /**
     * Обчислює кількість чергувань 0 та 1 у двійковому представленні числа.
     */
    private void comAlter() {
        binaryRep = Integer.toBinaryString(number);
        alternations = 0;
        for (int i = 0; i < binaryRep.length() - 1; i++) {
            if (binaryRep.charAt(i) != binaryRep.charAt(i + 1)) {
                alternations++;
            }
        }
    }

    public int getNumber() {
        return number;
    }

    public int getAlternations() {
        return alternations;
    }
    /**
     * Відновлення значення transient поля після десеріалізації.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        binaryRep = Integer.toBinaryString(number);
    }
    public String getBinaryRep(){
        return binaryRep;
    }
    @Override
    public String toString() {
        return String.format("%d || %d || %d", number, alternations, binaryRep);
    }
}