// Интерфейс с вложенным статическим классом
public interface InterfaceA {
    // Вложенный статический класс
    public static class NestedClass {
        public void func() {
            System.out.println("Метод из вложенного класса в интерфейсе");
        }
    }
}

// Внешний класс с методом main
public class Main {
    public static void main(String[] args) {
        // Создаем объект вложенного класса через интерфейс
        InterfaceA.NestedClass nestedObject = new InterfaceA.NestedClass();
        
        // Вызов метода из вложенного класса
        nestedObject.func();
    }
}
