import java.util.List;

// Контроллер отвечает за взаимодействие между внешним интерфейсом и логикой приложения.
public class StudentController implements UserController<Student> {

    // Сервис для работы с группами студентов
    private final StudentGroupService studentGroupService = new StudentGroupService();
    // Сервис для работы с потоками
    private final StreamService streamService = new StreamService();

    // Представление для вывода информации о студентах
    private final StudentView studentView = new StudentView();

    /**
     * Удаляет студента из группы по его полному имени.
     * Вызывает метод сервиса studentGroupService для выполнения операции удаления.
     * @param firstName Имя студента
     * @param lastName Фамилия студента
     * @param middleName Отчество студента
     */
    public void removeStudentByFIO(String firstName, String lastName, String middleName){
        studentGroupService.removeStudentByFIO(firstName, lastName, middleName);
    }

    /**
     * Получает список студентов, отсортированный по определённым критериям (например, по успеваемости).
     * Список выводится в консоль через объект studentView.
     * @return Отсортированный список студентов
     */
    public List<Student> getSortedStudentList() {
        // Получение отсортированного списка студентов из сервиса
        List<Student> studentList = studentGroupService.getSortedStudentList();
        // Отправка списка на консоль
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    /**
     * Получает список студентов, отсортированный по их полному имени (ФИО).
     * Использует метод сервиса studentGroupService для получения данных и выводит результат на консоль.
     * @return Список студентов, отсортированный по ФИО
     */
    public List<Student> getSortedStudentByFIO(){
        // Получение отсортированного по ФИО списка студентов
        List<Student> studentList = studentGroupService.getSortedStudentByFIO();
        // Отправка списка на консоль
        studentView.sendOnConsole(studentList);
        return studentList;
    }

    /**
     * Метод для сортировки списка потоков.
     * Делегирует задачу сортировки сервису streamService.
     * @param streams Список потоков, который нужно отсортировать
     */
    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams); // Используем сервис для сортировки
    }

    /**
     * Создаёт нового студента с указанным именем, фамилией и отчеством.
     * Делегирует создание сервиса studentGroupService.
     * @param firstName Имя студента
     * @param lastName Фамилия студента
     * @param middleName Отчество студента
     */
    @Override
    public void create(String firstName, String lastName, String middleName) {
        studentGroupService.createStudent(firstName, lastName, middleName);
    }
}
