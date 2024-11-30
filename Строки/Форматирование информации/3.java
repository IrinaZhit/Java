import java.util.Date;
import java.text.SimpleDateFormat;

public class DateFormatExample {
    public static void main(String[] args) {
        Date now = new Date(); // Получение текущей даты и времени

        // Форматирование даты и времени с использованием спецификаторов
        System.out.printf("Текущий год: %tY%n", now); // Год в четырехзначном формате
        System.out.printf("Текущий месяц (число): %tm%n", now); // Месяц в двузначном формате
        System.out.printf("Текущий день недели: %tA%n", now); // Полное название дня недели
        System.out.printf("Текущие часы (24-часовой формат): %tH%n", now); // Часы (00–23)
        System.out.printf("Текущие минуты: %tM%n", now); // Минуты (00–59)
    }
}
