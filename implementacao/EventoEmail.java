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