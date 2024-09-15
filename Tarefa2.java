public class Tarefa2 {
    private String titulo;
    private int prioridade;
    private String descricao;
    private String prazo;

    // Construtor que aceita apenas titulo e prioridade
    public Tarefa2(String titulo, int prioridade) {
        this.titulo = titulo;
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("Prioridade deve ser entre 1 e 5.");
        }
        this.descricao = "Sem descrição";
        this.prazo = "Sem prazo";
    }

    // Método privado para validar a prioridade
    private boolean isPrioridadeValida(int prioridade) {
        return prioridade >= 1 && prioridade <= 5;
    }

    // Getters e Setters (opcional)
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        if (isPrioridadeValida(prioridade)) {
            this.prioridade = prioridade;
        } else {
            throw new IllegalArgumentException("Prioridade deve ser entre 1 e 5.");
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getPrazo() {
        return prazo;
    }

    public void setPrazo(String prazo) {
        this.prazo = prazo;
    }

    public static void main(String[] args) {
        // Testando a classe Tarefa2
        Tarefa2 tarefa1 = new Tarefa2("Estudar Java", 3);
        System.out.println("Título: " + tarefa1.getTitulo());
        System.out.println("Prioridade: " + tarefa1.getPrioridade());
        System.out.println("Descrição: " + tarefa1.getDescricao());
        System.out.println("Prazo: " + tarefa1.getPrazo());

        // Tentando criar uma tarefa com prioridade inválida
        try {
            Tarefa2 tarefa2 = new Tarefa2("Estudar Python", 6);
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
