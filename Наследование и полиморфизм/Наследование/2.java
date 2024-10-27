// Класс A - суперкласс
class A {
    // Поля с разными спецификаторами доступа
    int a1;            // package-private (по умолчанию), доступен в пределах одного пакета
    public int a2;     // public, доступен везде
    protected int a3;  // protected, доступен в подклассах и в пределах пакета
    private int a4;    // private, доступен только в классе A

    // Методы с разными спецификаторами доступа
    void method1() {
        // package-private, доступен в пределах одного пакета
        System.out.println("method1 (package-private) в классе A");
    }

    public void method2() {
        // public, доступен везде
        System.out.println("method2 (public) в классе A");
    }

    protected void method3() {
        // protected, доступен в подклассах и в пределах пакета
        System.out.println("method3 (protected) в классе A");
    }

    private void method4() {
        // private, доступен только внутри класса A
        System.out.println("method4 (private) в классе A");
    }
}

// Класс B - подкласс, наследуется от A
class B extends A {
    void testInB() {
        // Доступ к полям
        a1 = 5;  // Доступен, так как package-private (B и A в одном пакете)
        a2 = 10; // Доступен, так как public
        a3 = 15; // Доступен, так как protected
        // a4 = 20; // Недоступен, так как private в классе A

        // Вызов методов
        method1();  // Доступен, так как package-private
        method2();  // Доступен, так как public
        method3();  // Доступен, так как protected
        // method4(); // Недоступен, так как private
    }
}

// Класс C - подкласс, наследуется от B
class C extends B {
    void testInC() {
        // Доступ к полям
        a1 = 50;  // Доступен, если C в том же пакете, что и A (package-private)
        a2 = 100; // Доступен, так как public
        a3 = 150; // Доступен, так как protected
        // a4 = 200; // Недоступен, так как private в классе A

        // Вызов методов
        method1();  // Доступен, если C и A в одном пакете (package-private)
        method2();  // Доступен, так как public
        method3();  // Доступен, так как protected
        // method4(); // Недоступен, так как private
    }
}

// Основной класс с методом main
public class Main {
    public static void main(String[] args) {
        // Создание объектов классов B и C
        B objB = new B();
        C objC = new C();

        // Тестирование методов и полей класса B
        System.out.println("Тестирование в классе B:");
        objB.testInB();
        objB.method2();  // Доступен, так как public
        objB.method3();  // Доступен, так как protected
        // objB.method4(); // Недоступен, так как private

        // Тестирование методов и полей класса C
        System.out.println("\nТестирование в классе C:");
        objC.testInC();
        objC.method2();  // Доступен, так как public
        objC.method3();  // Доступен, так как protected
        // objC.method4(); // Недоступен, так как private
    }
}
