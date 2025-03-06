package ex4;

import java.util.*;
import java.io.*;
import ex2.CalData;
import ex3.Text;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Зчитуємо числа для обчислення
        List<CalData> calDataList = new ArrayList<>();
        while (true) {
            System.out.print("Введіть число для обчислення (введіть -1 для завершення): ");
            int number = scanner.nextInt();
            if (number == -1) {
                break;
            }
            calDataList.add(new CalData(number)); // додаємо обчислені дані в список
        }

        System.out.print("Оберіть формат виведення (1 - Таблиця, 2 - Текст): ");
        int formatChoice = scanner.nextInt();
        scanner.nextLine(); // очищаємо буфер

        if (formatChoice == 1){
            // Виводимо формат рядка таблиці
            System.out.print("Введіть формат рядка таблиці (наприклад: %-10d || %-10d || %-10d): ");
            String rowFormat = scanner.nextLine();


            System.out.println("_______________________");

            // Виводимо кожен рядок таблиці
            for (CalData data : calDataList) {
                // Використовуємо методи getAlternations() та getBinaryRep()
                System.out.printf(rowFormat, data.getNumber(), data.getAlternations(), data.getBinaryRep());
                System.out.println();
            }

            System.out.println("_______________________");
        }else{
            Text textFormat = new Text();
            textFormat.display(calDataList);
        }
    }
}
