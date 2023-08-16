import java.util.List;
import java.util.stream.Stream;

public class ExemploDistinct {

    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.mockPessoas(100);

        Stream<Pessoa> stream = lista.stream().distinct();
    }
}
