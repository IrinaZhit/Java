public class Overload {

    // Метод для сложения двух целых чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для сложения трех целых чисел
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Метод для сложения двух чисел с плавающей запятой
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        OverloadExample example = new Overload();
        
        // Вызовы перегруженных методов
        System.out.println("Sum of two int: " + example.add(10, 20)); // 30
        System.out.println("Sum of three int: " + example.add(10, 20, 30)); // 60
        System.out.println("Sum of two double: " + example.add(10.5, 20.5)); // 31.0
    }
}
