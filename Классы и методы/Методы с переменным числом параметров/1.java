public class StringJoiner {

    // Метод для объединения двух строк
    public String join(String a, String b) {
        return a + " " + b;
    }

    // Перегруженный метод для объединения трёх строк
    public String join(String a, String b, String c) {
        return a + " " + b + " " + c;
    }

    // Перегруженный метод для объединения произвольного числа строк с varargs
    public String join(String... strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            if (result.length() > 0) {
                result.append(" ");
            }
            result.append(str);
        }
        return result.toString();
    }

    public static void main(String[] args) {
        StringJoiner joiner = new StringJoiner();

        // Вызов метода join с двумя аргументами
        System.out.println("Join 2 strings: " + joiner.join("Hello", "World"));

        // Вызов метода join с тремя аргументами
        System.out.println("Join 3 strings: " + joiner.join("Java", "is", "fun"));

        // Вызов метода join с произвольным числом аргументов (varargs)
        System.out.println("Join 5 strings: " + joiner.join("I", "love", "learning", "new", "things"));

        // Вызов метода join с одним аргументом
        System.out.println("Join 1 string: " + joiner.join("OnlyOne"));

        // Вызов метода join без аргументов (varargs вернёт пустую строку)
        System.out.println("Join no strings: '" + joiner.join() + "'");
    }
}
