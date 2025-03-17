// Implementação do Listener
class ConsoleNotificacaoListener implements NotificacaoListener {
    @Override
    public void onEventoOcorreu(String mensagem) {
    System.out.println("Notificação: " + mensagem);
    }
   }