// Внешний класс ClassA
public class ClassA {

    // Пример использования private внутреннего класса
    private class InnerPrivate {
        private String message = "InnerPrivate доступен только внутри ClassA";

        public void showMessage() {
            System.out.println(message);
        }
    }

    // Пример использования protected внутреннего класса
    protected class InnerProtected {
        private String message = "InnerProtected доступен в подклассах и в пределах пакета";

        public void showMessage() {
            System.out.println(message);
        }
    }

    // Пример использования public внутреннего класса
    public class InnerPublic {
        private String message = "InnerPublic доступен везде";

        public void showMessage() {
            System.out.println(message);
        }
    }

    // Пример использования package-private внутреннего класса (по умолчанию)
    class InnerPackagePrivate {
        private String message = "InnerPackagePrivate доступен только в пределах пакета";

        public void showMessage() {
            System.out.println(message);
        }
    }

    // Метод внешнего класса для демонстрации работы с внутренними классами
    public void createInnerClasses() {
        // Создаем объект private класса, можно только внутри ClassA
        InnerPrivate privateClass = new InnerPrivate();
        privateClass.showMessage();

        // Создаем объект protected класса, можно внутри ClassA
        InnerProtected protectedClass = new InnerProtected();
        protectedClass.showMessage();

        // Создаем объект public класса, можно внутри ClassA
        InnerPublic publicClass = new InnerPublic();
        publicClass.showMessage();

        // Создаем объект package-private класса, можно внутри ClassA
        InnerPackagePrivate packagePrivateClass = new InnerPackagePrivate();
        packagePrivateClass.showMessage();
    }
}

// Другой класс в том же пакете для демонстрации package-private и protected
class ClassB extends ClassA {

    public void accessProtectedClass() {
        // Доступ к protected классу, доступен в подклассе
        InnerProtected protectedClass = new InnerProtected();
        protectedClass.showMessage();

        // Доступ к package-private классу, доступен в том же пакете
        InnerPackagePrivate packagePrivateClass = new InnerPackagePrivate();
        packagePrivateClass.showMessage();
    }
}

// Основной класс для запуска
public class Main {
    public static void main(String[] args) {
        // Вызов метода createInnerClasses() в классе ClassA
        ClassA classA = new ClassA();
        classA.createInnerClasses();

        // Работа с публичным внутренним классом извне
        ClassA.InnerPublic publicClass = new ClassA().new InnerPublic();
        publicClass.showMessage();

        // Попробуем получить доступ к protected и package-private классам из другого класса
        ClassB classB = new ClassB();
        classB.accessProtectedClass();

        // Нельзя создать объект private класса напрямую вне ClassA:
        // ClassA.InnerPrivate privateClass = new ClassA().new InnerPrivate(); // Ошибка компиляции

        // Нельзя создать объект package-private класса вне пакета:
        // ClassA.InnerPackagePrivate packagePrivateClass = new ClassA().new InnerPackagePrivate(); // Ошибка компиляции
    }
}
