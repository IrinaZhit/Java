final class FinalClass {
    void display() {
        System.out.println("Это финальный класс.");
    }
}

// Попытка унаследовать final-класс приведет к ошибке компиляции
class SubClass extends FinalClass { // Ошибка здесь
    void show() {
        System.out.println("Это подкласс.");
    }
}

public class FinalClassDemo {
    public static void main(String[] args) {
        SubClass obj = new SubClass(); // Эта строка не компилируется
        obj.show();
    }
}
