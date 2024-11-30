public class StringMethodsDemo {
    public static void main(String[] args) {
        String str = "  Hello, World!  ";
        
        // 1. length() - возвращает длину строки
        int length = str.length();
        System.out.println("Длина строки: " + length);
        
        // 2. trim() - удаляет пробелы в начале и конце строки
        String trimmed = str.trim();
        System.out.println("После trim: '" + trimmed + "'");
        
        // 3. toUpperCase() - преобразует строку в верхний регистр
        String upper = str.toUpperCase();
        System.out.println("Вверхний регистр: " + upper);
        
        // 4. toLowerCase() - преобразует строку в нижний регистр
        String lower = str.toLowerCase();
        System.out.println("Нижний регистр: " + lower);
        
        // 5. substring(int beginIndex) - возвращает подстроку, начиная с заданного индекса
        String subStr = str.substring(7);
        System.out.println("Подстрока начиная с индекса 7: " + subStr);
        
        // 6. substring(int beginIndex, int endIndex) - возвращает подстроку между заданными индексами
        String subStrRange = str.substring(0, 5);
        System.out.println("Подстрока с индекса 0 до 5: " + subStrRange);
        
        // 7. charAt(int index) - возвращает символ по заданному индексу
        char character = str.charAt(1);
        System.out.println("Символ по индексу 1: " + character);
        
        // 8. indexOf(String str) - возвращает индекс первого вхождения заданной строки
        int index = str.indexOf("World");
        System.out.println("Индекс 'World': " + index);
        
        // 9. replace(char oldChar, char newChar) - заменяет все вхождения символа
        String replaced = str.replace('o', 'a');
        System.out.println("После замены 'o' на 'a': " + replaced);
        
        // 10. split(String regex) - разбивает строку по регулярному выражению
        String[] words = str.split(" ");
        System.out.println("После разбивки на слова:");
        for (String word : words) {
            System.out.println(word);
        }
    }
}
