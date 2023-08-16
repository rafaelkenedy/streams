import java.util.List;

public class ExemploAllMatch {


    public static void main(String[] args) {
        List<Pessoa> lista = Pessoa.mockPessoas(100);

        boolean result = lista.stream()
                .allMatch(pessoa -> pessoa.getNacionalidade().equals("Canadense"));

        System.out.println(result);
    }
}
