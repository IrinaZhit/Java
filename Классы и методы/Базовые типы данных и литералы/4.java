public class Main {
    public static void main(String[] args) {
        String str = "Число: ";
        int number = 10;
        double decimal = 5.5;
        boolean flag = true;

        String result1 = str + number;
        System.out.println(result1); // Вывод: Число: 10

        String result2 = str + decimal;
        System.out.println(result2); // Вывод: Число: 5.5

        String result3 = str + flag;
        System.out.println(result3); // Вывод: Число: true

        String combined = str + number + " и " + decimal + " и " + flag;
        System.out.println(combined); // Вывод: Число: 10 и 5.5 и true
    }
}
