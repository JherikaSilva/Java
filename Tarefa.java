import java.time.LocalDate;

public class Tarefa {


   private String titulo;
   private String descricao;
   private LocalDate dataEntrega;
   private boolean concluida;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}

