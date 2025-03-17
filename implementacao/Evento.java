// Interface de callback
interface NotificacaoListener {
    void onEventoOcorreu(String mensagem);
   }
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
   // Classe concreta EventoEmail
   class EventoEmail extends Evento {
    public EventoEmail() {
    super("Evento de E-mail");
    }
    @Override
    public void executar() {
    System.out.println("Enviando e-mail...");
    }
   }
   // Classe concreta EventoLog
   class EventoLog extends Evento {
    public EventoLog() {
    super("Evento de Log");
    }
    @Override
    public void executar() {
    System.out.println("Registrando log...");
    }
   }
   