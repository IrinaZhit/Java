import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        String filePath = "output.txt";

        // Запись данных в файл
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String data = "Hello, OutputStream!";
            
            // Записываем данные по одному символу (байту)
            for (char ch : data.toCharArray()) {
                fos.write(ch); // Пишем каждый символ как байт
            }
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Выводим предупреждение о завершении записи
        System.out.println("Данные успешно записаны в файл: " + filePath);
    }
}
