import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class FlushExample {
    public static void main(String[] args) {
        BufferedWriter writer = null;
        try {
            writer = new BufferedWriter(new FileWriter("example.txt"));
            writer.write("Hello, World!");
            // Вызываем flush, чтобы убедиться, что данные записаны
            writer.flush();
            System.out.println("Данные успешно записаны в файл.");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (writer != null) {
                    writer.close(); // Закрытие потока
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
