import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class ExemploFilter {

    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.mockPessoas(100);

        Stream<Pessoa> stream = lista.stream().filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"));


        Predicate<Pessoa> predicate = pessoa -> pessoa.getNacionalidade().equals("Brasileiro");
        Stream<Pessoa> stream1 = lista.stream().filter(predicate);

    }
}
