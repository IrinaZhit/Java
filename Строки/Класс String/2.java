import java.util.StringJoiner;

public class StringJoinerDemo {
    public static void main(String[] args) {
        // 1. Создание StringJoiner с разделителем
        StringJoiner joiner = new StringJoiner(", ");
        joiner.add("apple");
        joiner.add("banana");
        joiner.add("orange");
        System.out.println("StringJoiner с разделителем: " + joiner);

        // 2. Создание StringJoiner с префиксом и суффиксом
        StringJoiner joinerWithPrefixSuffix = new StringJoiner(", ", "[", "]");
        joinerWithPrefixSuffix.add("John");
        joinerWithPrefixSuffix.add("Jane");
        joinerWithPrefixSuffix.add("Doe");
        System.out.println("StringJoiner с префиксом и суффиксом: " + joinerWithPrefixSuffix);

        // 3. Объединение двух StringJoiner
        StringJoiner joiner2 = new StringJoiner(", ");
        joiner2.add("cat");
        joiner2.add("dog");
        
        StringJoiner mergedJoiner = joiner.merge(joiner2);
        System.out.println("Объединённый StringJoiner: " + mergedJoiner);
        
        // 4. Использование StringJoiner с пустыми значениями
        StringJoiner emptyJoiner = new StringJoiner(", ");
        System.out.println("Пустой StringJoiner: " + emptyJoiner.toString());
    }
}
