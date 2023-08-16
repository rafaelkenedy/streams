import java.util.List;

public class ExemploForEach {

    public static void main(String[] args) {

        List<Pessoa> list = Pessoa.mockPessoas(10);

        list.forEach(pessoa -> System.out.println(pessoa.getNome()));

        System.out.println("\nBrasil\n");

        list.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .forEach(p -> System.out.println(p.getNome()));

        list.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .map(Pessoa::getIdade)
                .forEach(System.out::println);





    }
}
