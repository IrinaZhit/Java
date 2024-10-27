// Первый интерфейс с методом по умолчанию
interface Interface1 {
    default void display() {
        System.out.println("Метод display() из Interface1");
    }
}

// Второй интерфейс с тем же методом по умолчанию
interface Interface2 {
    default void display() {
        System.out.println("Метод display() из Interface2");
    }
}

// Класс, реализующий оба интерфейса
public class MyClass implements Interface1, Interface2 {
    // Переопределение метода display() для разрешения конфликта
    @Override
    public void display() {
        // Вызов метода display() из Interface1
        Interface1.super.display();
        // Вызов метода display() из Interface2
        Interface2.super.display();
    }

    public static void main(String[] args) {
        MyClass obj = new MyClass();
        obj.display(); // Вывод: Метод display() из Interface1
                       //         Метод display() из Interface2
    }
}
