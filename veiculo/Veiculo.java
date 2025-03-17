abstract class Veiculo {
 protected String marca;
 public Veiculo(String marca) {
 this.marca = marca;
 }
 public abstract void acelerar();
 public void mostrarMarca() {
 System.out.println("A marca do veículo é: " + marca);
 }
}