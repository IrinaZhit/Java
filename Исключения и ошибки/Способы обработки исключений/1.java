public class ExceptionHandlingExample {
    public static void main(String[] args) {
        try {
            // Генерация деления на ноль (ArithmeticException)
            int result = 10 / 0; // Это исключение будет не перехвачено
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Деление на ноль - " + e.getMessage());
        }

        // Генерация IndexOutOfBoundsException без обработки
        int[] array = {1, 2, 3};
        // Это исключение не будет обработано и приведет к аварийному завершению
        int value = array[5]; // Попытка доступа к несуществующему индексу
    }
}
