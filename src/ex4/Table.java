package ex4;

import ex2.CalData;
import ex3.Result;
import java.util.List;

public class Table implements Result {
    private String tableHeader;
    private String rowFormat;

    public Table(String tableHeader, String rowFormat) {
        this.tableHeader = tableHeader;
        this.rowFormat = rowFormat;
    }

    @Override
    public void display(List<CalData> results) {
        // Виводимо заголовок таблиці
        System.out.println(tableHeader);
        System.out.println("_______________________");
        
        // Форматуємо кожен рядок результатів у форматі таблиці
        for (CalData data : results) {
            // Форматуємо рядок з числами в таблиці
            System.out.printf(rowFormat, data.getNumber(), data.getAlternations(), data.getBinaryRep());
            System.out.println();
        }
        
        // Після таблиці виводимо роздільник
        System.out.println("_______________________");
    }
}