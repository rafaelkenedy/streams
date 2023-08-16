import java.util.*;
import java.util.stream.Collectors;

public class ExemplosCollect {

    public static void main(String[] args) {

        List<Pessoa> lista = Pessoa.mockPessoas(10);

//        lista.stream()
//                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
//                .toList()
//                .forEach(System.out::println);

        Set<Pessoa> set = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.toSet());

        ArrayList<Pessoa> arrayList = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.toCollection(ArrayList::new));

        TreeSet<Pessoa> treeSet = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.toCollection(TreeSet::new));

        Map<String, Pessoa> map = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.toMap(Pessoa::getId, Pessoa::new));

        map.forEach((id, pessoa) -> System.out.println(pessoa.getNome()));

        Map<Integer, List<Pessoa>> byAge = lista.stream()
                .filter(pessoa -> pessoa.getNacionalidade().equals("Brasileiro"))
                .collect(Collectors.groupingBy(Pessoa::getIdade));

        byAge.forEach((age, pessoas) -> {
            System.out.println(age);
            pessoas.forEach(pessoa -> System.out.println(pessoa.toString()));
        });

        Map<String, Integer> porNacionadlidadeESomadoIdades = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade, Collectors.summingInt(Pessoa::getIdade)));

        Map<String, Double> nacionalidadeIdadeMedia = lista.stream()
                .collect(Collectors.groupingBy(Pessoa::getNacionalidade, Collectors.averagingInt(Pessoa::getIdade)));

        System.out.println("Idades somadas!");
        System.out.println(porNacionadlidadeESomadoIdades);

        System.out.println("Média idade por nacionalidade!");
        nacionalidadeIdadeMedia.forEach((nacionalidade, media) ->
                System.out.println(nacionalidade + " " +media.intValue()));
    }

}

