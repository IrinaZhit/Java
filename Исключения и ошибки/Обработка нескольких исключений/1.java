class Ex1 extends Exception {}
class Ex2 extends Ex1 {}
class Ex3 extends Ex2 {}

public class MultipleExceptionsExample {
    public static void main(String[] args) {
        try {
            // Генерация Ex2
            throw new Ex2();
            // Для демонстрации Ex3 можно раскомментировать следующую строку:
            // throw new Ex3(); 
        } catch (Ex1 e) {  // Обработка Ex1 и её подклассов идентичным образом
            System.out.println("Обработано исключение Ex1 (или его подклассы): " + e.getClass().getSimpleName());
        } catch (Ex2 e) {  // Этот блок будет проигнорирован, так как Ex2 уже обрабатывается в Ex1
            System.out.println("Обработано исключение Ex2: " + e.getClass().getSimpleName());
        } catch (Ex3 e) {  // Этот блок будет проигнорирован, так как Ex3 уже обрабатывается в Ex1
            System.out.println("Обработано исключение Ex3: " + e.getClass().getSimpleName());
        }
        
        try {
            // Генерация Ex3
            throw new Ex3(); 
        } catch (Ex3 e) {  // Это исключение будет обработано здесь
            System.out.println("Обработано исключение Ex3: " + e.getClass().getSimpleName());
        } catch (Ex2 e) {  // Этот блок будет проигнорирован, так как Ex3 уже обрабатывается в Ex3
            System.out.println("Обработано исключение Ex2: " + e.getClass().getSimpleName());
        } catch (Ex1 e) {  // Этот блок также будет проигнорирован здесь
            System.out.println("Обработано исключение Ex1: " + e.getClass().getSimpleName());
        }
    }
}
