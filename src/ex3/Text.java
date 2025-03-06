package ex3;

import ex2.CalData;
import java.util.List;
/**
 * Клас, що реалізує текстове відображення результатів обчислень.
 */
public class Text implements Result{
    @Override
    public void display(List<CalData> results) {
        System.out.println("Результати обчислень:");
        for (CalData data : results) {
            System.out.println(data);
        }
    }
}
