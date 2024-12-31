import java.util.List;

/**
 * Класс TeacherController управляет взаимодействием с учителями.
 * Он вызывает методы сервиса для добавления, редактирования и получения учителей,
 * а также передает данные представлению для отображения.
 */
public class TeacherController implements UserController<Teacher> {

    private final TeacherService teacherService = new TeacherService(); // Сервис для работы с учителями
    private final TeacherView teacherView = new TeacherView(); // Представление для вывода информации о учителях

    /**
     * Метод для создания нового учителя.
     * @param firstName Имя нового учителя
     * @param lastName Фамилия нового учителя
     * @param middleName Отчество нового учителя
     */
    @Override
    public void create(String firstName, String lastName, String middleName) {
        teacherService.createTeacher(firstName, lastName, middleName); // Создаем нового учителя через сервис
    }

    /**
     * Метод для редактирования данных учителя по его ID.
     * @param teacherId Идентификатор учителя, данные которого нужно редактировать
     * @param firstName Новое имя учителя
     * @param lastName Новая фамилия учителя
     * @param middleName Новое отчество учителя
     */
    public void editTeacher(Long teacherId, String firstName, String lastName, String middleName) {
        teacherService.editTeacher(teacherId, firstName, lastName, middleName); // Редактируем данные через сервис
    }

    /**
     * Метод для отображения всех учителей в системе.
     */
    public void showAllTeachers() {
        List<Teacher> teachers = teacherService.getAllTeachers(); // Получаем список учителей
        teacherView.sendOnConsole(teachers); // Отправляем список в представление для отображения
    }
}
