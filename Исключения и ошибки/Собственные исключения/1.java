// Объявление собственного исключения
class MyFirstException extends Exception {
    // Конструктор по умолчанию
    public MyFirstException() {
        super("Произошло пользовательское исключение.");
    }

    // Конструктор с сообщением об ошибке
    public MyFirstException(String message) {
        super(message);
    }

    // Конструктор с сообщением и причиной
    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }
}

// Пример использования пользовательского исключения
public class ExceptionDemo {
    public static void main(String[] args) {
        try {
            // Генерация пользовательского исключения
            throw new MyFirstException("Это пользовательское исключение");
        } catch (MyFirstException e) {
            // Обработка исключения
            System.out.println("Перехвачено: " + e.getMessage());
        }
    }
}
