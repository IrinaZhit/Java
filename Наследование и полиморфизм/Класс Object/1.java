class Person {
    private String name;
    private int age;

    // Конструктор
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object obj) {
        // Проверка на идентичность
        if (this == obj) {
            return true;
        }

        // Проверка на правильный тип
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }

        // Приведение типа
        Person person = (Person) obj;

        // Сравнение полей
        return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
    }

    @Override
    public int hashCode() {
        // Вычисление хэш-кода на основе значений полей
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}
/*
Соглашения при реализации метода equals()

Рефлексивность: Для любого ненулевого значения x, должно быть x.equals(x) равно true.

Симметричность: Для любых ненулевых значений x и y, если x.equals(y) равно true, тогда и y.equals(x) должно возвращать true.

Транзитивность: Если x.equals(y) и y.equals(z) возвращают true, то x.equals(z) должно тоже возвращать true.

Согласованность: Если два объекта равны, их значение должно оставаться неизменным при многократных вызовах метода equals.

Сравнение с null: Для любого ненулевого значения x, должно быть x.equals(null) равно false.
При соблюдении этих соглашений реализация метода equals() будет корректной и предсказуемой.
*/
