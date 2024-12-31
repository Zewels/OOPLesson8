import java.util.List;

/**
 * Класс StudentView реализует интерфейс UserView для отображения информации о студентах.
 * Этот класс отвечает за вывод списка студентов на консоль.
 */
public class StudentView implements UserView<Student> {

    /**
     * Метод для вывода списка студентов на консоль.
     * Каждый студент выводится с его уникальным идентификатором (StudentId).
     *
     * @param list Список студентов, который нужно вывести на консоль.
     */
    @Override
    public void sendOnConsole(List<Student> list) {
        // Проходим по каждому студенту в списке
        for (Student student : list) {
            // Выводим уникальный идентификатор студента
            System.out.println(student.getStudentId());
        }
    }
}
