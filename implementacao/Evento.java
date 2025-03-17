   // Classe abstrata Evento
   abstract class Evento {
    private final String nome; // Atributo final
    public Evento(String nome) {
    this.nome = nome;
    }
    public String getNome() {
    return nome;
    }
    public abstract void executar(); // Método abstrato
   }