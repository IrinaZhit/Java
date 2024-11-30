class AreaCalculator {

    // Метод для вычисления площади круга
    public double area(double radius) {
        return Math.PI * radius * radius;
    }

    // Метод для вычисления площади прямоугольника
    public double area(double length, double width) {
        return length * width;
    }

    // Метод для вычисления площади треугольника
    public double area(double base, double height) {
        return 0.5 * base * height;
    }
}

public class Main {
    public static void main(String[] args) {
        AreaCalculator calculator = new AreaCalculator();

        // Вызов перегруженных методов
        double circleArea = calculator.area(5);              // Площадь круга
        double rectangleArea = calculator.area(4, 6);        // Площадь прямоугольника
        double triangleArea = calculator.area(4, 5);         // Площадь треугольника

        System.out.println("Площадь круга: " + circleArea);          // 78.53981633974483
        System.out.println("Площадь прямоугольника: " + rectangleArea); // 24.0
        System.out.println("Площадь треугольника: " + triangleArea);    // 10.0
    }
}
