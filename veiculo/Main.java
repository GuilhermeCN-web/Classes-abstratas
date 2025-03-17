public class Main {
    public static void main(String[] args) {
    Veiculo meuCarro = new Carro("Toyota");
    Veiculo minhaMoto = new Moto("Honda");
    meuCarro.mostrarMarca(); // Saída: A marca do veículo é: Toyota
    meuCarro.acelerar(); // Saída: O carro está acelerando.
    minhaMoto.mostrarMarca(); // Saída: A marca do veículo é: Honda
    minhaMoto.acelerar(); // Saída: A moto está acelerando.
    }
   }
   