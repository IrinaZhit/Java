import java.util.List;
import java.util.ArrayList;

public class Main {

    // Метод для суммирования зарплат (пример использования <? extends Number>)
    public static double SumSalaries(List<? extends Number> salaries) {
        double sum = 0;
        for (Number salary : salaries) {
            sum += salary.doubleValue();
        }
        return sum;
    }

    // Метод для добавления премий (пример использования <? super Integer>)
    public static void AddBonuses(List<? super Integer> salaries) {
        salaries.add(500);  // Добавляем премию в 500
        salaries.add(300);  // Добавляем премию в 300
    }

    public static void main(String[] args) {
        // Пример с <? extends Number>
        List<Integer> IntSalaries = List.of(1000, 1500, 2000); // список с Integer
        List<Double> DoubleSalaries = List.of(1200.50, 2300.75, 3100.20); // список с Double

        System.out.println("Sum of int salaries: " + SumSalaries(IntSalaries));
        System.out.println("Sum of double salaries: " + SumSalaries(DoubleSalaries));

        // Пример с <? super Integer>
        List<Number> NumberSalaries = new ArrayList<>(List.of(1000, 1500, 2000));
        List<Object> ObjectSalaries = new ArrayList<>(List.of(2500, 3000, 3500));

        AddBonuses(NumberSalaries);  // Передаем список типа Number
        AddBonuses(ObjectSalaries);  // Передаем список типа Object

        System.out.println("Number salaries with bonuses: " + NumberSalaries);
        System.out.println("Object salaries with bonuses: " + ObjectSalaries);
    }
}
