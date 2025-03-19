
package libreria;

public class Main {
  
    public static void main(String[] args) {
        LibreriaFriasGutierrezMarta2425T4 miLibreriaFriasGutierrezMarta2425T4;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaFriasGutierrezMarta2425T4 = new LibreriaFriasGutierrezMarta2425T4("Don Quijote de la Mancha", 10, 45, 120);

    compraQuijoteFriasGutierrezMarta2425T4(miLibreriaFriasGutierrezMarta2425T4);
        
        saldoActual = miLibreriaFriasGutierrezMarta2425T4.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaFriasGutierrezMarta2425T4.obtenerNombre();
        stock = miLibreriaFriasGutierrezMarta2425T4.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
    añadeIngresoFriasGutierrezMarta2425T4(miLibreriaFriasGutierrezMarta2425T4, "Libro vendido");
    }

  public static void añadeIngresoFriasGutierrezMarta2425T4(LibreriaFriasGutierrezMarta2425T4 miLibreriaFriasGutierrezMarta2425T4, String concepto) {
    double ingreso;
    double saldoActual;
    try
    {
      ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
      miLibreriaFriasGutierrezMarta2425T4.aumentarSaldo(ingreso);
      saldoActual = miLibreriaFriasGutierrezMarta2425T4.obtenerSaldo();
      System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
    } catch (Exception e)
    {
      System.out.println("Fallo al obtener el saldo al ingresar");
    }
  }

  public static void compraQuijoteFriasGutierrezMarta2425T4(LibreriaFriasGutierrezMarta2425T4 miLibreriaFriasGutierrezMarta2425T4) {
    String x;
    int num;
    double dinero;
    double saldoActual;
    try
    {
      x = "Don Quijote de la Mancha";
      num = 2;    //Número de ejemplares a comprar
      dinero = miLibreriaFriasGutierrezMarta2425T4.obtenerPrecio();
      saldoActual = miLibreriaFriasGutierrezMarta2425T4.obtenerSaldo();
      System.out.println("El libro "+x+" vale "+dinero+"€");
      System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
      miLibreriaFriasGutierrezMarta2425T4.comprarLibro(num);
    } catch (Exception e)
    {
      System.out.println("Error en la compra del libro");
    }
  }
}
