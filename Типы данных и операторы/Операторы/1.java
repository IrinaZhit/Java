public class OperatorsExample {
    public static void main(String[] args) {
        // Операторы присваивания
        int a = 10;
        a += 5; // 15
        System.out.println("a += 5: " + a);
        
        a -= 3; // 12
        System.out.println("a -= 3: " + a);
        
        a *= 2; // 24
        System.out.println("a *= 2: " + a);
        
        a /= 4; // 6
        System.out.println("a /= 4: " + a);
        
        a %= 5; // 1
        System.out.println("a %= 5: " + a);

        // Тернарный оператор
        int b = 5;
        String result = (b > 3) ? "b больше 3" : "b меньше или равно 3";
        System.out.println(result);

        // Логические операторы
        boolean x = true;
        boolean y = false;
        
        System.out.println("x || y: " + (x || y)); // true
        System.out.println("x && y: " + (x && y)); // false
        System.out.println("x | y: " + (x | y)); // true
        System.out.println("x ^ y: " + (x ^ y)); // true
        System.out.println("x & y: " + (x & y)); // false

        // Операторы сравнения
        System.out.println("a == 1: " + (a == 1)); // true
        System.out.println("a > 0: " + (a > 0)); // true
        System.out.println("a >= 1: " + (a >= 1)); // true
        System.out.println("a < 5: " + (a < 5)); // false
        System.out.println("a <= 1: " + (a <= 1)); // true

        // Сдвиговые операторы
        int c = 8; // 1000 в двоичном
        System.out.println("c >> 2: " + (c >> 2)); // 2 (10 в двоичном)
        System.out.println("c >>> 2: " + (c >>> 2)); // 2 (10 в двоичном)
        System.out.println("c << 2: " + (c << 2)); // 32 (100000 в двоичном)

        // Арифметические операторы
        int d = 5;
        int e = 2;
        System.out.println("d + e: " + (d + e)); // 7
        System.out.println("d - e: " + (d - e)); // 3
        System.out.println("d * e: " + (d * e)); // 10
        System.out.println("d / e: " + (d / e)); // 2
        System.out.println("d % e: " + (d % e)); // 1

        // Унарные операторы
        int f = 10;
        System.out.println("++f: " + (++f)); // 11 (префиксная форма)
        System.out.println("f++: " + (f++)); // 11 (постфиксная форма)
        System.out.println("f: " + f); // 12

        System.out.println("--f: " + (--f)); // 11 (префиксная форма)
        System.out.println("f--: " + (f--)); // 11 (постфиксная форма)
        System.out.println("f: " + f); // 10

        // Побитовый оператор
        System.out.println("~f: " + (~f)); // -11 (инверсия битов)
        System.out.println("!true: " + (!true)); // false

        // Операторы со строками
        String str1 = "Hello, ";
        String str2 = "World!";
        String str3 = str1 + str2; // Конкатенация строк
        System.out.println("str3: " + str3); // Hello, World!
    }
}

