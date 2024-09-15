// Classe Categoria
class Categoria {
    private String nome;

    // Construtor
    public Categoria(String nome) {
        this.nome = nome;
    }

    // Métodos get e set para nome
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

// Classe Tarefa
public class Tarefa {
    private String titulo;
    private String descricao;
    private String prazo;
    private int prioridade;
    private Categoria categoria;

    // Construtor
    public Tarefa(String titulo, String descricao, String prazo, int prioridade) {
        this.titulo = titulo;
        this.descricao = descricao;
        this.prazo = prazo;
        this.prioridade = prioridade;
    }

    // Métodos get e set para título
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    // Métodos get e set para descrição
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    // Métodos get e set para prazo
    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    // Métodos get e set para prioridade
    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    // Métodos get e set para categoria
    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    // Método para exibir detalhes da tarefa
    public void exibirDetalhes() {
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prazo: " + prazo);
        System.out.println("Prioridade: " + prioridade);
        if (categoria != null) {
            System.out.println("Categoria: " + categoria.getNome());
        }
    }

    // Método principal para testar
    public static void main(String[] args) {
        // Desafio 1
        Tarefa tarefa = new Tarefa("Estudar Java", "Estudar conceitos de POO", "2024-09-30", 1);
        tarefa.setTitulo("Estudar Java Avançado");
        System.out.println("Novo Título: " + tarefa.getTitulo());

        // Desafio 2
        tarefa.exibirDetalhes();

        // Desafio 3
        Categoria categoria = new Categoria("Estudos");
        tarefa.setCategoria(categoria);
        tarefa.exibirDetalhes();
    }
}
