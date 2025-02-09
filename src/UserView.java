import java.util.List;

/**
 * Интерфейс UserView определяет методы для отображения информации о пользователях на консоли.
 * Этот интерфейс может быть реализован различными классами для разных способов вывода.
 *
 * @param <T> Тип пользователя, который должен быть наследником класса User.
 */
public interface UserView<T extends User> {

    /**
     * Метод для вывода списка пользователей на консоль.
     * Реализация этого метода должна обеспечивать вывод списка пользователей в нужном формате.
     *
     * @param list Список пользователей для отображения.
     */
    void sendOnConsole(List<T> list);
}
