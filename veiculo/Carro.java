class Carro extends Veiculo {
 public Carro(String marca) {
 super(marca);
 }
 @Override
 public void acelerar() {
 System.out.println("O carro está acelerando.");
 }
}