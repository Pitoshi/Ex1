import java.time.LocalDate;
import java.time.LocalDate;

public class CactusWateringProgram {
    public static void main(String[] args) {
        LocalDate lastWateringDate = LocalDate.of(2022, 3, 10); // Пример даты последнего полива

        MoistureSensor sensor = new MoistureSensor();
        int moistureLevel = sensor.getMoistureLevel();

        LocalDate nextWateringDate;

        if (LocalDate.now().getMonthValue() >= 12 || LocalDate.now().getMonthValue() <= 2) {
            nextWateringDate = lastWateringDate.plusMonths(1);
        } else if (LocalDate.now().getMonthValue() >= 3 && LocalDate.now().getMonthValue() <= 5 ||
                LocalDate.now().getMonthValue() >= 9 && LocalDate.now().getMonthValue() <= 11) {
            nextWateringDate = lastWateringDate.plusWeeks(1);
        } else {
            if (moistureLevel < 30) {
                nextWateringDate = LocalDate.now();
            } else {
                nextWateringDate = lastWateringDate.plusDays(2);
            }
        }

        System.out.println("Дата следующего полива: " + nextWateringDate);
    }
}