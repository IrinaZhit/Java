public class StringBufferBuilderDemo {
    public static void main(String[] args) {
        // Создание объекта StringBuilder
        StringBuilder sb = new StringBuilder("Hello");
        // Метод append() добавляет строку в конец текущего содержимого
        sb.append(" World");
        System.out.println("StringBuilder после append(): " + sb);

        // Метод insert() вставляет строку по указанному индексу
        sb.insert(5, ",");
        System.out.println("StringBuilder после insert(): " + sb);

        // Метод replace() заменяет часть строки на другую строку
        sb.replace(6, 11, "Java");
        System.out.println("StringBuilder после replace(): " + sb);

        // Метод delete() удаляет часть строки от начального до конечного индекса
        sb.delete(5, 6);
        System.out.println("StringBuilder после delete(): " + sb);

        // Метод reverse() возвращает строку в обратном порядке
        sb.reverse();
        System.out.println("StringBuilder после reverse(): " + sb);

        // Создание объекта StringBuffer
        StringBuffer sbf = new StringBuffer("Hello");
        // Метод append() добавляет строку в конец текущего содержимого
        sbf.append(" Buffer");
        System.out.println("StringBuffer после append(): " + sbf);

        // Метод insert() вставляет строку по указанному индексу
        sbf.insert(5, ",");
        System.out.println("StringBuffer после insert(): " + sbf);

        // Метод replace() заменяет часть строки на другую строку
        sbf.replace(6, 12, "String");
        System.out.println("StringBuffer после replace(): " + sbf);

        // Метод delete() удаляет часть строки от начального до конечного индекса
        sbf.delete(5, 6);
        System.out.println("StringBuffer после delete(): " + sbf);

        // Метод reverse() возвращает строку в обратном порядке
        sbf.reverse();
        System.out.println("StringBuffer после reverse(): " + sbf);
    }
}
