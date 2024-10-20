// Публичный класс с публичным методом
public class Animal {
    public void eat() {
        System.out.println("Animal is eating.");
    }
}

// Класс с приватным методом
public class Dog {
    private void bark() {
        System.out.println("Dog is barking.");
    }

    public void callBark() {
        bark(); // Можно вызвать приватный метод внутри класса
    }
}

// Класс с защищенным методом
public class Cat {
    protected void meow() {
        System.out.println("Cat is meowing.");
    }
}

// Подкласс Cat
class Kitten extends Cat {
    public void callMeow() {
        meow(); // Можно вызвать защищенный метод из подкласса
    }
}

// Класс с пакетным доступом
class Fish {
    void swim() {
        System.out.println("Fish is swimming.");
    }
}

public class AccessModifiersDemo {
    public static void main(String[] args) {
        //публичный класс
        Animal animal = new Animal();
        animal.eat(); // Доступно в любом месте

        //приватный класс
        Dog dog = new Dog();
        dog.callBark(); // Доступно через публичный метод

        //защищенный класс
        Kitten kitten = new Kitten();
        kitten.callMeow(); // Доступно через подкласс

        //пакетный доступ
        Fish fish = new Fish();
        fish.swim(); // Доступно в том же пакете
    }
}
