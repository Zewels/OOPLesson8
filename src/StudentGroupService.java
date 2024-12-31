import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class StudentGroupService {

    private StudentGroup studentGroup; // Группа студентов, с которой работает сервис

    /**
     * Метод для удаления студента из группы по полному имени (ФИО).
     * Процесс удаления включает в себя поиск студента по имени, фамилии и отчеству,
     * а затем удаление его из списка студентов.
     *
     * @param firstName Имя студента
     * @param lastName Фамилия студента
     * @param middleName Отчество студента
     */
    public void removeStudentByFIO(String firstName, String lastName, String middleName) {
        // Получаем итератор для обхода студентов в группе
        Iterator<Student> iterator = studentGroup.iterator();

        // Проходим по всем студентам в группе
        while (iterator.hasNext()) {
            Student student = iterator.next();

            // Проверяем, совпадают ли имя, фамилия и отчество с переданными значениями
            if (student.getFirstName().equals(firstName) &&
                    student.getLastName().equals(lastName) &&
                    student.getMiddleName().equals(middleName)) {

                // Если совпадает, удаляем студента через итератор
                iterator.remove();
                // Выход из цикла после удаления студента
                return;
            }
        }
    }

    /**
     * Метод для получения отсортированного списка студентов по их идентификатору.
     * Сортировка происходит в порядке возрастания идентификаторов (по умолчанию для объектов Student).
     *
     * @return Отсортированный список студентов по идентификатору
     */
    public List<Student> getSortedStudentList() {
        // Копируем список студентов из группы
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());

        // Сортируем список студентов (по умолчанию сравниваются по ID, так как Student реализует Comparable)
        Collections.sort(studentList);

        // Возвращаем отсортированный список
        return studentList;
    }

    /**
     * Метод для получения отсортированного списка студентов по ФИО.
     * Студенты сортируются в алфавитном порядке по имени, фамилии и отчеству.
     * Для сортировки используется кастомный компаратор, основанный на сравнении ФИО.
     *
     * @return Отсортированный список студентов по ФИО
     */
    public List<Student> getSortedStudentByFIO() {
        // Копируем список студентов из группы
        List<Student> studentList = new ArrayList<>(studentGroup.getStudentList());

        // Сортируем список студентов по ФИО с использованием кастомного компаратора
        studentList.sort(new UserComparator<Student>());

        // Возвращаем отсортированный список
        return studentList;
    }

    /**
     * Метод для создания нового студента и добавления его в группу.
     *
     * @param firstName Имя нового студента
     * @param lastName Фамилия нового студента
     * @param middleName Отчество нового студента
     */
    public void createStudent(String firstName, String lastName, String middleName) {
        studentGroup.createStudent(firstName, lastName, middleName);
    }
}
