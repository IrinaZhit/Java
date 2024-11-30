class Person {
    public void displayInfo() {
        System.out.println("Это информация о человеке.");
    }
}

class Student extends Person {
    @Override // Указание, что метод должен переопределять метод суперкласса
    public void displayInfo() { // Теперь правильно указано имя метода
        System.out.println("Это информация о студенте.");
        }
    
    /*
    // Ошибка: неверно указано имя метода
     @Override
    public void displayInf() { // Пропущена буква "o"
        System.out.println("Это информация о студенте.");
    }
    */
}

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.displayInf(); // Вызов метода Student, который не переопределяет displayInfo
    }
}
