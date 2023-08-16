import java.util.List;

public class ExemploCount {

    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.mockPessoas(10);

        long count = lista.stream()
                .filter(pessoa -> pessoa.getNome().startsWith("A"))
                .count();

        System.out.println(count);
    }
}
