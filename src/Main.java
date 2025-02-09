public class Main {

    /**
     * Главный метод для запуска программы.
     * Здесь происходит создание учителей, их редактирование и отображение списка учителей.
     */
    public static void main(String[] args) {
        // Создание контроллера для работы с учителями
        TeacherController teacherController = new TeacherController();

        // Создание двух учителей с уникальными ФИО
        teacherController.create("Иван", "Иванов", "Иванович");  // Создаем учителя с именем Иван
        teacherController.create("Мария", "Петрова", "Сергеевна");  // Создаем учителя с именем Мария

        // Отображение всех учителей в системе
        teacherController.showAllTeachers();  // Этот метод выведет информацию о всех учителях в консоль

        // Редактирование первого учителя (с ID 1)
        teacherController.editTeacher(1L, "Иван", "Иванов", "Петрович");  // Меняем отчество Ивановича на Петрович

        // Отображение списка учителей после редактирования
        teacherController.showAllTeachers();  // Этот метод снова выведет информацию о всех учителях после изменений
    }
}
