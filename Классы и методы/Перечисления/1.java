// Перечисление для представления различных видов фруктов
public enum Fruit {
    APPLE(1.5, "A red or green fruit that is sweet and crisp."),
    BANANA(0.5, "A long yellow fruit that is soft and sweet."),
    ORANGE(1.0, "A round citrus fruit with a tough skin and juicy flesh."),
    GRAPE(2.0, "A small, round fruit that grows in bunches and is often purple or green.");

    private final double price; // цена фрукта
    private final String description; // описание фрукта

    // Конструктор перечисления
    Fruit(double price, String description) {
        this.price = price;
        this.description = description;
    }

    // Метод для получения цены фрукта
    public double getPrice() {
        return price;
    }

    // Метод для получения описания фрукта
    public String getDescription() {
        return description;
    }
}

// Класс для тестирования перечисления
public class Main {
    public static void main(String[] args) {
        // Перебираем все элементы перечисления и выводим информацию о каждом фрукте
        for (Fruit fruit : Fruit.values()) {
            System.out.printf("Fruit: %s, Price: %.2f, Description: %s%n", 
                              fruit.name(), fruit.getPrice(), fruit.getDescription());
        }
    }
}
