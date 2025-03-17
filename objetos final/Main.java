public class Main {
    public static void main(String[] args) {
    final Pessoa pessoa = new Pessoa("João");
    // pessoa = new Pessoa("Maria"); // Erro de compilação: não pode alterar a referência
    pessoa.setNome("Maria"); // Ok: o estado interno do objeto pode ser alterado
    System.out.println("Nome: " + pessoa.nome); // Saída: Nome: Maria
    }
   }
   