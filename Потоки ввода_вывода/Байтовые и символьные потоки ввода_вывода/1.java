import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        String filePath = "example.txt";

        // Запись данных в файл
        try (FileOutputStream fos = new FileOutputStream(filePath)) {
            String data = "Hello, world!";
            fos.write(data.getBytes()); // Записываем данные в файл
        } catch (IOException e) {
            System.err.println("Ошибка при записи в файл: " + e.getMessage());
        }

        // Чтение данных из файла
        try (FileInputStream fis = new FileInputStream(filePath)) {
            int byteData;
            System.out.print("Содержимое файла: ");
            while ((byteData = fis.read()) != -1) { // Читаем байт за байтом
                System.out.print((char) byteData); // Преобразуем байт в символ и выводим
            }
        } catch (IOException e) {
            System.err.println("Ошибка при чтении из файла: " + e.getMessage());
        }

        // Удаление файла после использования (по желанию)
        new File(filePath).delete();
    }
}
