class Shape {
    // Метод для расчета площади
    public double area() {
        return 0; // Базовый класс возвращает 0
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Переопределяем метод area для круга
    @Override
    public double area() {
        return Math.PI * radius * radius; // Возвращает площадь круга
    }
}

public class Main {
    public static void main(String[] args) {
        Shape shape = new Shape(); // Создаем экземпляр базового класса
        Circle circle = new Circle(5); // Создаем экземпляр подкласса

        // Вызов метода area для базового класса
        System.out.println("Площадь формы: " + shape.area()); // Выведет: Площадь формы: 0.0

        // Вызов переопределенного метода area для круга
        System.out.println("Площадь круга: " + circle.area()); // Выведет: Площадь круга: 78.53981633974483
    }
}
