import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class ExemploOptional {

    public static void main(String[] args) {

        List<Pessoa> lista = Pessoa.mockPessoas(100);

        Optional<Pessoa> optionalMax = lista.stream().max(Comparator.comparing(Pessoa::getIdade));
        Optional<Pessoa> optionalMin = lista.stream().max(Comparator.comparing(Pessoa::getIdade));

        if (optionalMax.isPresent()){
            System.out.println(optionalMax);
        }

        optionalMax.ifPresent(System.out::println);
    }
}
