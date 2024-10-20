public class AutoBoxingExample {
    public static void main(String[] args) {
        Integer integerObject = null; // Инициализация объекта Integer значением null
        // Попытка распаковать null в примитивный тип int
        int primitiveInt = integerObject; // Здесь будет выброшено исключение NullPointerException
        System.out.println("Primitive int: " + primitiveInt);
    }
}
