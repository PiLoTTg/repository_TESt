public class Medicine {

    public static void main(String[] args) {

        String medicineName = "Аспірин";  // Назва ліків
        String scheduleTime = "08:00";  // Час прийому
        String doctorInfo = "Доктор Іваненко. Центральна лікарня №2";  // Дані лікаря та лікарні

        // Виводимо інформацію на екран
        System.out.println("Система активована");
        System.out.println("Ліки у списку: " + medicineName);
        System.out.println("Час прийому: " + scheduleTime);
        System.out.println("Ваш лікар: " + doctorInfo);

        // Звукове сповіщення
        System.out.println("Увага! Час прийому ліків!");

        // Повторюємо сигнал 5 разів, як вказано у вимогах
        for (int i = 1; i <= 5; i++) {
            System.out.println("Сигнал №" + i + ": ПРИЙМІТЬ ЛІКИ!");
        }
        // Звіт для лікаря та користувача

        System.out.println("Користувач підтвердив прийом");

        // Формування звіту для лікаря
        System.out.println("ФОРМУВАННЯ ЗВІТУ ДЛЯ ЛІКАРЯ:");
        System.out.println("Препарат: " + medicineName);
        System.out.println("Час прийому: " + scheduleTime);
        System.out.println("Статус: Виконано успішно");
    }
}