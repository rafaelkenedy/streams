import java.util.*;

public class Pessoa implements Comparable {

    private String id;
    private String nome;
    private String nacionalidade;
    private int idade;

    public Pessoa() {
    }

    public Pessoa(String id, String nome, String nacionalidade, int idade) {
        this.id = id;
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
    }

    public Pessoa(Pessoa pessoa) {
        this(
                pessoa.getId(),
                pessoa.getNome(),
                pessoa.getNacionalidade(),
                pessoa.getIdade()
        );
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pessoa pessoa = (Pessoa) o;
        return Objects.equals(id, pessoa.id) && Objects.equals(nome, pessoa.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nome);
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "id='" + id + '\'' +
                ", nome='" + nome + '\'' +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static List<Pessoa> mockPessoas(int quantidade) {
        String[] nomes = {"Alice", "Bob", "Charlie", "David", "Eva"};
        String[] nacionalidades = {"Brasileiro", "Americano", "Canadense", "Britânico", "Francês"};
        Random random = new Random();

        List<Pessoa> pessoas = new ArrayList<>();
        for (int i = 0; i < quantidade; i++) {
            Pessoa pessoa = new Pessoa();
            pessoa.setId(UUID.randomUUID().toString());
            pessoa.setNome(nomes[random.nextInt(nomes.length)]);
            pessoa.setNacionalidade(nacionalidades[random.nextInt(nacionalidades.length)]);
            pessoa.setIdade(random.nextInt(60) + 18);
            pessoas.add(pessoa);
        }

        return pessoas;
    }


    @Override
    public int compareTo(Object o) {
        return 0;
    }
}
