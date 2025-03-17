// Classe GerenciadorEventos
class GerenciadorEventos {
    private List<Evento> eventos = new ArrayList<>();
    private List<NotificacaoListener> listeners = new ArrayList<>();
    public void adicionarEvento(Evento evento) {
    eventos.add(evento);
    }
    public void adicionarListener(NotificacaoListener listener) {
    listeners.add(listener);
    }
    public void notificarTodos() {
    for (Evento evento : eventos) {
    evento.executar();
    for (NotificacaoListener listener : listeners) {
    listener.onEventoOcorreu("Evento ocorreu: " + evento.getNome());
            }
        }
    }
   }