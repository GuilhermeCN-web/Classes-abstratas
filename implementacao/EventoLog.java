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