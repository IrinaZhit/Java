import java.util.Formatter;
import java.util.Date;

public class FormatterExample {
    public static void main(String[] args) {
        // Создание объекта Formatter
        Formatter formatter = new Formatter();

        // Пример использования спецификатора %d (десятичное целое значение)
        int integerValue = 100;
        formatter.format("Число: %d%n", integerValue);

        // Пример использования спецификатора %f (десятичное значение с плавающей точкой)
        double floatingPointValue = 123.456;
        formatter.format("Плавающая точка: %.2f%n", floatingPointValue); // С двумя знаками после запятой

        // Пример использования спецификатора %s (строковое представление аргумента)
        String stringValue = "Привет, мир!";
        formatter.format("Строка: %s%n", stringValue);

        // Пример использования спецификатора %t (время и дата)
        Date date = new Date();
        formatter.format("Дата и время: %tF %tT%n", date, date); // YYYY-MM-DD и HH:mm:ss

        // Пример использования спецификатора %% (вставка знака %)
        formatter.format("Процент: 100%% выполнено.%n");

        // Вывод отформатированного текста
        System.out.println(formatter);

        // Закрытие объекта Formatter
        formatter.close();
    }
}
