import java.time.LocalDate;
import java.util.Random;

class MoistureSensor {
    public int getMoistureLevel() {
        // Здесь можно использовать реальные данные с датчика, но для примера используем случайное число
        Random random = new Random();
        return random.nextInt(100); // Генерация случайной влажности от 0 до 100%
    }
}

