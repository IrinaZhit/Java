class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class InstanceofExample {
    public static void main(String[] args) {
        Animal animal = new Dog();
        Dog dog = new Dog();
        Cat cat = new Cat();
        Object obj = null;

        // Примеры использования instanceof
        System.out.println("animal instanceof Dog: " + (animal instanceof Dog)); // true
        System.out.println("animal instanceof Animal: " + (animal instanceof Animal)); // true
        System.out.println("dog instanceof Dog: " + (dog instanceof Dog)); // true
        System.out.println("dog instanceof Animal: " + (dog instanceof Animal)); // true
        System.out.println("cat instanceof Cat: " + (cat instanceof Cat)); // true
        System.out.println("cat instanceof Dog: " + (cat instanceof Dog)); // false

        // Пример с null
        System.out.println("obj instanceof Animal: " + (obj instanceof Animal)); // false
        System.out.println("obj instanceof null: " + (obj instanceof Object)); // false
    }
}
