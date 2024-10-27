public class OuterClass {
    // Поля с различными спецификаторами доступа
    public String publicField = "Публичное поле";
    protected String protectedField = "Защищенное поле";
    String packagePrivateField = "Поле по умолчанию (package-private)";
    private String privateField = "Приватное поле";

    // Методы с различными спецификаторами доступа
    public void publicMethod() {
        System.out.println("Публичный метод внешнего класса");
    }

    protected void protectedMethod() {
        System.out.println("Защищенный метод внешнего класса");
    }

    void packagePrivateMethod() {
        System.out.println("Метод по умолчанию (package-private) внешнего класса");
    }

    private void privateMethod() {
        System.out.println("Приватный метод внешнего класса");
    }

    // Внутренний класс
    public class InnerClass {
        public void accessOuterClassMembers() {
            // Доступ к полям внешнего класса
            System.out.println("Доступ к полям внешнего класса из внутреннего класса:");
            System.out.println(publicField);          // Доступен
            System.out.println(protectedField);       // Доступен
            System.out.println(packagePrivateField);  // Доступен
            System.out.println(privateField);         // Доступен (даже если private)

            // Доступ к методам внешнего класса
            System.out.println("Доступ к методам внешнего класса из внутреннего класса:");
            publicMethod();           // Доступен
            protectedMethod();        // Доступен
            packagePrivateMethod();   // Доступен
            privateMethod();          // Доступен (даже если private)
        }
    }

    // Метод для демонстрации работы
    public void createInnerObject() {
        // Создаем объект внутреннего класса и вызываем его метод
        InnerClass inner = new InnerClass();
        inner.accessOuterClassMembers();
    }

    public static void main(String[] args) {
        // Создаем объект внешнего класса и вызываем метод createInnerObject()
        OuterClass outer = new OuterClass();
        outer.createInnerObject();
    }
}
