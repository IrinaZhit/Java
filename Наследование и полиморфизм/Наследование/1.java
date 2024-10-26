// Суперкласс Parent
class Parent {
    int value;

    // Конструктор суперкласса Parent
    Parent(int value) {
        this.value = value;  // this указывает на поле суперкласса
    }

    // Метод суперкласса, который выводит значение поля value
    void display() {
        System.out.println("Значение суперкласса: " + this.value);
    }
}

// Подкласс Child, который наследуется от Parent
class Child extends Parent {
    int value;  // Поле с таким же именем, как у суперкласса

    // Конструктор подкласса Child
    Child(int value) {
        super(value + 10);  // super вызывает конструктор суперкласса и передает ему значение (value + 10)
        this.value = value;  // this указывает на поле подкласса, а не на суперкласс
    }

    // Переопределенный метод display в подклассе
    @Override
    void display() {
        super.display();  // super вызывает метод display суперкласса
        System.out.println("Значение подкласса: " + this.value);  // this.value - поле подкласса
    }
}

// Основной класс с методом main
public class Main {
    public static void main(String[] args) {
        // Создаем объект подкласса Child
        Child child = new Child(20);

        // Вызываем метод display, который сначала выведет данные суперкласса, затем данные подкласса
        child.display();
    }
}
