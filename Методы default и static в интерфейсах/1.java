// Определение интерфейса с неабстрактным и статическим методом
public interface MyInterface {
    // Неабстрактный метод с реализацией по умолчанию
    default void defaultMethod() {
        System.out.println("Это метод по умолчанию из интерфейса.");
    }
    
    // Статический метод
    static void staticMethod() {
        System.out.println("Это статический метод из интерфейса.");
    }
}

// Класс, реализующий интерфейс
public class MyClass implements MyInterface {
    // Дополнительный метод класса
    public void classMethod() {
        System.out.println("Это метод класса MyClass.");
    }
}

// Главный класс для демонстрации вызовов методов
public class Main {
    public static void main(String[] args) {
        // Создаем объект класса, реализующего интерфейс
        MyClass myObject = new MyClass();

        // 1. Вызов метода по умолчанию через объект класса
        myObject.defaultMethod(); // Вывод: Это метод по умолчанию из интерфейса.

        // 2. Вызов статического метода интерфейса
        MyInterface.staticMethod(); // Вывод: Это статический метод из интерфейса.

        // 3. Вызов метода класса
        myObject.classMethod(); // Вывод: Это метод класса MyClass.
    }
}
