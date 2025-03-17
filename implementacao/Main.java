// Classe Main para testar o sistema
public class Main {
    public static void main(String[] args) {
    GerenciadorEventos gerenciador = new GerenciadorEventos();
    // Adicionando eventos
    gerenciador.adicionarEvento(new EventoEmail());
    gerenciador.adicionarEvento(new EventoLog());
    // Adicionando listener
    gerenciador.adicionarListener(new ConsoleNotificacaoListener());
    // Notificando todos os eventos
    gerenciador.notificarTodos();
    }
   }