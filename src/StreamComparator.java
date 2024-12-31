import java.util.Comparator;

// Класс StreamComparator для сравнения количества учебных групп в потоке
public class StreamComparator implements Comparator<Stream> {

    /**
     * Метод сравнения потоков по количеству учебных групп
     * @param o1 первый поток
     * @param o2 второй поток
     * @return отрицательное число, если o1 меньше o2, положительное, если больше, и 0, если равны
     */
    @Override
    public int compare(Stream o1, Stream o2) {
        return Integer.compare(o1.getGroupCount(), o2.getGroupCount()); // Сравниваем количество групп
    }
}
