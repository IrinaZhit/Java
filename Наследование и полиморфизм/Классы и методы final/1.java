class Superclass {
    final void display() {
        System.out.println("Это метод суперкласса.");
    }
}

class Subclass extends Superclass {
    // Попытка переопределить final-метод приведет к ошибке компиляции
    void display() {
        System.out.println("Это метод подкласса.");
    }
}

public class FinalMethodDemo {
    public static void main(String[] args) {
        Subclass obj = new Subclass();
        obj.display();
    }
}
