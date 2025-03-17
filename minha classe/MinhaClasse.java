class MinhaClasse {
    final int valorFinal; // Variável de instância final
    public MinhaClasse(int valor) {
    this.valorFinal = valor; // Inicializada no construtor
    }
    public void tentarAlterarValor() {
    // this.valorFinal = 10; // Erro de compilação: não pode alterar um valor final
    }
    public void metodoFinal(int i) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'metodoFinal'");
    }
   }