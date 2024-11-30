class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void sound() {
        System.out.println("Животное издает звук");
    }
}

class Dog extends Animal {
    Dog(String name) {
        super(name); // Вызов конструктора суперкласса
    }

    // Переопределяем метод sound()
    void sound() {
        super.sound(); // Вызов метода суперкласса
        System.out.println("Собака лает");
    }

    void display() {
        System.out.println("Имя: " + super.name); // Доступ к полю суперкласса
    }
}

public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog dog = new Dog("Бобик");
        dog.sound(); // Вызов переопределённого метода
        dog.display(); // Вызов метода display()
    }
}
