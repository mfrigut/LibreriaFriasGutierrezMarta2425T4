package libreria;

/**
 * Clase principal de nuestra librería. Aquí gestionamos la compra de libros y
 * el saldo disponible.
 */
public class Main {

  /**
   * Método principal de la aplicación
   *
   * @param args Argumentos de línea de comandos
   */
  public static void main(String[] args) {
    LibreriaFriasGutierrezMarta2425T4 miLibreriaFriasGutierrezMarta2425T4;
    String x;
    int stock;
    int num;
    double dinero;
    double saldoActual;
    double ingreso;

    // Creación de una librería con un libro inicial: Don Quijote de la Mancha
    miLibreriaFriasGutierrezMarta2425T4 = new LibreriaFriasGutierrezMarta2425T4("Don Quijote de la Mancha", 10, 45, 120);

    // Realizamos la compra de un ejemplar de Don Quijote
    compraQuijoteFriasGutierrezMarta2425T4(miLibreriaFriasGutierrezMarta2425T4);

    // Mostramos el saldo actual después de la compra
    saldoActual = miLibreriaFriasGutierrezMarta2425T4.obtenerSaldo();
    System.out.println("El saldo al comprar el libro es de " + saldoActual);

    // Obtenemos el nombre del libro y el stock disponible
    x = miLibreriaFriasGutierrezMarta2425T4.obtenerNombre();
    stock = miLibreriaFriasGutierrezMarta2425T4.obtenerStock();
    System.out.println("El libro " + x + " tiene un stock de " + stock + " unidades ahora");

    // Añadimos un ingreso tras la venta de un libro
    añadeIngresoFriasGutierrezMarta2425T4(miLibreriaFriasGutierrezMarta2425T4, "Libro vendido");
  }

  /**
   * Método que añade un ingreso al saldo de la librería.
   *
   * @param miLibreriaFriasGutierrezMarta2425T4 Ilibreria sobre la que se
   * realiza la compra
   * @param concepto Descripción del ingreso realizado
   */
  public static void añadeIngresoFriasGutierrezMarta2425T4(LibreriaFriasGutierrezMarta2425T4 miLibreriaFriasGutierrezMarta2425T4, String concepto) {
    double ingreso;
    double saldoActual;
    try {
      ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
      miLibreriaFriasGutierrezMarta2425T4.aumentarSaldo(ingreso);
      saldoActual = miLibreriaFriasGutierrezMarta2425T4.obtenerSaldo();
      System.out.println("Tu saldo actual después de ingresar es de " + saldoActual + "€");
    } catch (Exception e) {
      System.out.println("Fallo al obtener el saldo al ingresar");
    }
  }

  /**
   * Método que realiza la compra de ejemplares de "Don Quijote de la Mancha" y
   * actualiza el saldo de la librería
   *
   * @param miLibreriaFriasGutierrezMarta2425T4 Ilibreria sobre la que se
   * realiza la compra.
   */
  public static void compraQuijoteFriasGutierrezMarta2425T4(LibreriaFriasGutierrezMarta2425T4 miLibreriaFriasGutierrezMarta2425T4) {
    String x;
    int num;
    double dinero;
    double saldoActual;
    try {
      x = "Don Quijote de la Mancha";
      num = 2;    //Número de ejemplares a comprar
      dinero = miLibreriaFriasGutierrezMarta2425T4.obtenerPrecio();
      saldoActual = miLibreriaFriasGutierrezMarta2425T4.obtenerSaldo();
      System.out.println("El libro " + x + " vale " + dinero + "€");
      System.out.println("El saldo actual de la librería es de " + saldoActual + "€");
      miLibreriaFriasGutierrezMarta2425T4.comprarLibro(num);
    } catch (Exception e) {
      System.out.println("Error en la compra del libro");
    }
  }
}
