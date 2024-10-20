public class BooleanExample {
    public static void main(String[] args) {
        // Использование конструктора класса Boolean (устарело)
        Boolean boolean1 = new Boolean(true);
        System.out.println("Using constructor: " + boolean1);

        // Использование статического метода Boolean.valueOf() с булевым значением
        Boolean boolean2 = Boolean.valueOf(false);
        System.out.println("Using valueOf(boolean): " + boolean2);

        // Использование статического метода Boolean.valueOf() со строкой
        Boolean boolean3 = Boolean.valueOf("true");
        System.out.println("Using valueOf(String): " + boolean3);

        // Использование статического метода Boolean.valueOf() с недопустимой строкой
        Boolean boolean4 = Boolean.valueOf("not_a_boolean");
        System.out.println("Using valueOf(invalid String): " + boolean4);

        // Использование статического метода Boolean.parseBoolean() для преобразования строки в примитивный boolean
        boolean primitiveBoolean = Boolean.parseBoolean("false");
        System.out.println("Using parseBoolean(): " + primitiveBoolean);
    }
}
