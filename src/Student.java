// Класс Student представляет сущность студента с его идентификатором и именем.
public class Student extends User implements Comparable<Student> {

    // Уникальный идентификатор студента
    private Long studentId;

    /**
     * Конструктор для создания объекта Student.
     * @param firstName Имя студента
     * @param lastName Фамилия студента
     * @param middleName Отчество студента
     */
    public Student(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName);
    }

    /**
     * Возвращает уникальный идентификатор студента.
     * @return уникальный идентификатор
     */
    public Long getStudentId() {
        return studentId;
    }

    /**
     * Устанавливает уникальный идентификатор студента.
     * @param studentId уникальный идентификатор
     */
    public void setStudentId(Long studentId) {
        this.studentId = studentId;
    }

    /**
     * Реализация метода compareTo для сравнения студентов по их идентификатору.
     * @param o другой объект Student для сравнения
     * @return отрицательное число, если текущий идентификатор меньше,
     *         положительное число, если больше,
     *         или 0, если идентификаторы равны
     */
    @Override
    public int compareTo(Student o) {
        return this.studentId.compareTo(o.studentId);
    }
}
