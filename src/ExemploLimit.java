import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExemploLimit {

    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.mockPessoas(100);

        Stream<Pessoa> stream = lista.stream().limit(2);

//        for (Pessoa pessoa : (Iterable<Pessoa>) stream::iterator) {
//            System.out.println(pessoa);
//        }

        List<Pessoa> consumedList = stream.toList();

        consumedList.forEach(System.out::println);

//        stream.forEach(System.out::println);
//
//        stream.forEach(pessoa -> System.out.println(pessoa));


    }
}
