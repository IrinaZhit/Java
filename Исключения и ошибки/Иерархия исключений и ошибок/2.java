public class ExceptionExamples {
    public static void main(String[] args) {
        // Пример ArithmeticException
        try {
            int result = 10 / 0; // Деление на ноль
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль - " + e.getMessage());
        }

        // Пример ArrayIndexOutOfBoundsException
        int[] array = {1, 2, 3};
        try {
            int value = array[5]; // Доступ к несуществующему индексу
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ошибка: Индекс массива вне диапазона - " + e.getMessage());
        }

        // Пример IllegalArgumentException
        try {
            throw new IllegalArgumentException("Недопустимый аргумент"); // Генерация исключения
        } catch (IllegalArgumentException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }

        // Пример ClassCastException
        Object obj = new Integer(100);
        try {
            String str = (String) obj; // Неверное приведение типов
        } catch (ClassCastException e) {
            System.out.println("Ошибка: Неверное приведение типа - " + e.getMessage());
        }

        // Пример NullPointerException
        String str = null;
        try {
            int length = str.length(); // Вызов метода на нулевом объекте
        } catch (NullPointerException e) {
            System.out.println("Ошибка: Попытка обращения к null - " + e.getMessage());
        }
    }
}
