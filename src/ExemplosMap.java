import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ExemplosMap {

    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.mockPessoas(100);

        Stream<Integer> stream = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Canadense"))
                .map(Pessoa::getIdade);

        IntStream stream1 = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Canadense"))
                .mapToInt(Pessoa::getIdade);
    }
}
