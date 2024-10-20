public class Main {
    public static void main(String[] args) {
        Integer decimal = Integer.decode("11");
        Integer hex = Integer.decode("0x3A");
        Integer octal = Integer.decode("5346");

        System.out.println("Decimal: " + decimal);
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + octal);
    }
}
