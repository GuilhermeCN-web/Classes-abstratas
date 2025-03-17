public class Main {
    public static void main(String[] args) {
    Circulo circulo = new Circulo(5);
    System.out.println("Área do círculo: " + circulo.calcularArea()); // Saída: Área do círculo: 78.53981633974483
    Forma.mostrarTipo(); // Saída: Isso é uma forma geométrica.
    circulo.mostrarDescricao(); // Saída: Esta é uma descrição da forma.
    }
   }