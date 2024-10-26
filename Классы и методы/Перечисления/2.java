// Перечисление Seasons с дополнительным методом для подсчета количества дней в сезоне
public enum Seasons {

    WINTER(90),  // Зима длится 90 дней
    SPRING(92),  // Весна длится 92 дня
    SUMMER(93),  // Лето длится 93 дня
    FALL(91);    // Осень длится 91 день

    private int days;  // Поле для хранения количества дней в сезоне

    // Конструктор перечисления
    Seasons(int days) {
        this.days = days;
    }

    // Метод для получения количества дней в сезоне
    public int getDays() {
        return this.days;
    }

    // Дополнительный метод, который возвращает "теплый" или "холодный" сезон
    public String getSeasonType() {
        switch (this) {
            case WINTER:
                return "Холодное время года";
            case SPRING:
            case SUMMER:
                return "Тёплое время года";
            case FALL:
                return "Умеренное время года";
            default:
                return "Неизвестное время года";
        }
    }
    
    public static void main(String[] args) {
        // Пример использования методов перечисления
        for (Seasons season : Seasons.values()) {
            System.out.println(season + " длится " + season.getDays() + " дней и это " + season.getSeasonType());
        }
    }
}
