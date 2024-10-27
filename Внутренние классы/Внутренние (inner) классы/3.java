public class OuterClass {
    // Поле внешнего класса
    private String outerField = "Поле внешнего класса";

    // Внутренний класс
    public class InnerClass {
        // Поля с разными модификаторами доступа
        public String publicInnerField = "Публичное поле внутреннего класса";
        protected String protectedInnerField = "Защищенное поле внутреннего класса";
        String packagePrivateInnerField = "Поле по умолчанию (package-private) внутреннего класса";
        private String privateInnerField = "Приватное поле внутреннего класса";

        // Методы с разными модификаторами доступа
        public void publicInnerMethod() {
            System.out.println("Публичный метод внутреннего класса");
        }

        protected void protectedInnerMethod() {
            System.out.println("Защищенный метод внутреннего класса");
        }

        void packagePrivateInnerMethod() {
            System.out.println("Метод по умолчанию (package-private) внутреннего класса");
        }

        private void privateInnerMethod() {
            System.out.println("Приватный метод внутреннего класса");
        }
    }

    // Метод внешнего класса для доступа к полям и методам внутреннего класса
    public void accessInnerClass() {
        // Создание экземпляра внутреннего класса
        InnerClass inner = new InnerClass();

        // Доступ к полям внутреннего класса
        System.out.println(inner.publicInnerField);          // Доступен
        System.out.println(inner.protectedInnerField);       // Доступен
        System.out.println(inner.packagePrivateInnerField);  // Доступен
        // System.out.println(inner.privateInnerField);      // Ошибка компиляции - private поле недоступно

        // Доступ к методам внутреннего класса
        inner.publicInnerMethod();           // Доступен
        inner.protectedInnerMethod();        // Доступен
        inner.packagePrivateInnerMethod();   // Доступен
        // inner.privateInnerMethod();       // Ошибка компиляции - private метод недоступен
    }

    public static void main(String[] args) {
        OuterClass outer = new OuterClass();
        outer.accessInnerClass(); // Вызов метода, демонстрирующего доступ к внутреннему классу
    }
}
