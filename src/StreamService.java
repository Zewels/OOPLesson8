import java.util.Collections;
import java.util.List;

// Класс StreamService для работы с потоками
public class StreamService {

    // Метод для сортировки списка потоков с использованием StreamComparator
    public void sortStreams(List<Stream> streams) {
        Collections.sort(streams, new StreamComparator()); // Сортировка потоков по количеству групп
    }
}
