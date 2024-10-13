// Интерфейс
interface Животное {
    void издатьЗвук();
}

// Реализация интерфейса
class Собака implements Животное {
    public void издатьЗвук() {
        System.out.println("Гав!");
    }
}

public class Main {
    public static void main(String[] args) {
        var собака = new Собака(); // использование var
        собака.издатьЗвук(); // Вывод: Гав!
    }
} // интерфейс Животное, реализовали его в классе Собака и использовали var для создания объекта.
