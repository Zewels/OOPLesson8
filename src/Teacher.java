/**
 * Класс Teacher представляет учителя и наследует функциональность от класса User.
 * Он содержит уникальный идентификатор для каждого учителя.
 */
public class Teacher extends User {

    private Long teacherId; // Уникальный идентификатор учителя

    /**
     * Конструктор для создания нового учителя с указанными ФИО.
     * @param firstName Имя учителя
     * @param lastName Фамилия учителя
     * @param middleName Отчество учителя
     */
    public Teacher(String firstName, String lastName, String middleName) {
        super(firstName, lastName, middleName); // Вызов конструктора родительского класса для установки ФИО
    }

    /**
     * Геттер для получения уникального идентификатора учителя.
     * @return teacherId
     */
    public Long getTeacherId() {
        return teacherId;
    }

    /**
     * Сеттер для установки уникального идентификатора учителя.
     * @param teacherId Уникальный идентификатор учителя
     */
    public void setTeacherId(Long teacherId) {
        this.teacherId = teacherId;
    }
}
