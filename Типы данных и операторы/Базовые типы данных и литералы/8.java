//Интерфейс
interface Animal {
    void makeSound();
}

//Реализация интерфейса
class Dog implements Animal {
    public void makeSound() {
        System.out.println("Bark!");
    }
}

public class Main {
    public static void main(String[] args) {
        var dog = new Dog(); // использование var
        dog.makeSound(); //Вывод: Bark!
    }
} // интерфейс Животное, реализовали его в классе Собака и использовали var для создания объекта.
