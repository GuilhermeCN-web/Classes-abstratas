public class Main {
    public static void main(String[] args) {
    final int[] numeros = {1, 2, 3};
    // numeros = new int[5]; // Erro de compilação: não pode alterar a referência
    numeros[0] = 10; // Ok: os elementos do array podem ser modificados
    System.out.println("Primeiro elemento: " + numeros[0]); // Saída: Primeiro elemento: 10
    }
   }