import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReaderExample {
    public static void main(String[] args) {
        // Укажите путь к вашему текстовому файлу
        File file = new File("example.txt");

        // Создаем объект Scanner для чтения файла
        try (Scanner fileScanner = new Scanner(file)) {
            // Читаем файл построчно
            while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                System.out.println(line); // Выводим прочитанную строку
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден: " + e.getMessage());
        }
    }
}
