import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class ExemploSorted {

    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.mockPessoas(100);

        Stream<Pessoa> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .sorted(Comparator.comparing(Pessoa::getNome));

        Stream<Pessoa> stream1 = lista.stream()
                .sorted(Comparator.comparing(Pessoa::getIdade));

        Stream<Pessoa> stream2 = lista.stream()
                .sorted((p1, p2) -> Integer.compare(p2.getIdade(), p1.getIdade()));
    }
}
