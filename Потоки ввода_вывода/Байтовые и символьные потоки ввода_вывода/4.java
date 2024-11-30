class MyResource implements AutoCloseable {
    public void doSomething() {
        System.out.println("Doing something with MyResource.");
    }

    @Override
    public void close() {
        System.out.println("MyResource is being closed.");
    }
}

public class AutoCloseableExample {
    public static void main(String[] args) {
        try (MyResource resource = new MyResource()) {
            resource.doSomething();
        } // Здесь вызывается метод close() автоматически
    }
}

/*
Класс MyResource реализует интерфейс AutoCloseable и переопределяет метод close(), в котором указано, что должно происходить при закрытии ресурса.

В методе main() создается объект MyResource в блоке try-with-resources. Это гарантирует, что метод close() будет вызван автоматически по завершении блока, даже если возникло исключение.

При выполнении программы будет выведено сообщение о том, что ресурс используется, а затем сообщение о том, что он закрывается.
Использование AutoCloseable значительно упрощает управление ресурсами и делает код более чистым и безопасным.
  */
