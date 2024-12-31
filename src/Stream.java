import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Класс Stream представляет собой поток студентов, содержащий список учебных групп.
public class Stream implements Iterable<StudentGroup> {

    // Список учебных групп в потоке
    private List<StudentGroup> studentGroups;

    // Конструктор, инициализирующий список учебных групп
    public Stream() {
        this.studentGroups = new ArrayList<>();
    }

    // Геттер для получения списка учебных групп
    public List<StudentGroup> getStudentGroups() {
        return studentGroups;
    }

    // Сеттер для установки списка учебных групп
    public void setStudentGroups(List<StudentGroup> studentGroups) {
        this.studentGroups = studentGroups;
    }

    // Метод для добавления учебной группы в поток
    public void addStudentGroup(StudentGroup studentGroup) {
        this.studentGroups.add(studentGroup);
    }

    // Реализация метода iterator из интерфейса Iterable
    @Override
    public Iterator<StudentGroup> iterator() {
        return studentGroups.iterator();
    }

    // Метод для получения количества учебных групп в потоке
    public int getGroupCount() {
        return studentGroups.size();
    }
}
