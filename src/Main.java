import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

        Stream<String> list = List.of("Rafael", "João", "José").stream();
        Stream<String> stream = Stream.of("Rafael", "João", "José");

        Stream<String> set = Set.of("Rafael", "João", "José").stream();

        Map<String, String> map = Map.of("Rafael", "Alves");
        Stream<String> chaves = map.keySet().stream();
        Stream<String> valores = map.values().stream();





    }
}