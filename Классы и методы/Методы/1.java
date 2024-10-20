// Пример перегрузки и переопределения методов в классах фигур
public class Shape {

    // Метод для вычисления площади прямоугольника
    public double area(double length, double width) {
        return length * width;
    }

    // Метод для вычисления площади квадрата
    public double area(double side) {
        return side * side;
    }

    // Метод для вычисления площади круга
    public double area(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        }
        return 0;
    }

    // Суперкласс для фигур
    static class ShapeOperation {
        public void draw() {
            System.out.println("Drawing a generic shape.");
        }
    }

    // Подкласс для прямоугольника
    static class Rectangle extends ShapeOperation {
        @Override
        public void draw() {
            System.out.println("Drawing a rectangle.");
        }
    }

    // Подкласс для круга
    static class Circle extends ShapeOperation {
        @Override
        public void draw() {
            System.out.println("Drawing a circle.");
        }
    }

    public static void main(String[] args) {
        Shape shape = new Shape();
        
        // Вызовы перегруженных методов для вычисления площади
        System.out.println("Area of rectangle: " + shape.area(10, 20)); // 200.0
        System.out.println("Area of square: " + shape.area(10)); // 100.0
        System.out.println("Area of circle: " + shape.area(10, true)); // 314.1592653589793

        // Тестируем переопределение методов
        ShapeOperation myShapeOperation = new ShapeOperation(); // Суперкласс
        ShapeOperation myRectangle = new Rectangle(); // Подкласс для прямоугольника
        ShapeOperation myCircle = new Circle(); // Подкласс для круга

        myShapeOperation.draw();      // Drawing a generic shape.
        myRectangle.draw();           // Drawing a rectangle.
        myCircle.draw();              // Drawing a circle.
    }
}
