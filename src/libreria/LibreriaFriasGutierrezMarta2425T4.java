package libreria;

/**
 * Clase que representa la disponibilidad (stock) de libros, sus precio y el saldo de una libreria.
 * @author Marta Frías Gutiérrez
 * 
 */
public class LibreriaFriasGutierrezMarta2425T4 {

  private String nom;      // Nombre del libro
  private int cantidad;     // Cantidad de ejemplares en stock
  private double precio;  // Precio unitario del libro
  private double saldo;   // Saldo de la librería

  /**
   * Método que obtiene el nombre del libro
   * @return Nombre del libro
   */
  public String getNom() {
    return nom;
  }

  /**
   * Método que establece el nombre del libro
   * @param nom Nombre del libro a establecer
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * Método que obtiene la cantidad de libros disponibles (en stock)
   * @return Cantidad de libros disponibles (en stock)
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * Método que establece la cantidad de libros disponibles (en stock)
   * @param cantidad Nueva cantidad de libros disponibles (en stock)
   */
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  /**
   * Método que obtiene el precio de un libro
   * @return Precio del libro
   */
  public double getPrecio() {
    return precio;
  }

  /**
   * Método que establece el precio de un libro
   * @param precio Nuevo precio del libro
   */
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  /**
   * Método que obtiene el saldo de la librería
   * @return Saldo actual
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * Método que establece el saldo de la librería
   * @param saldo Nuevo saldo a establecer
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Constructor sin parámetros
   */
  public LibreriaFriasGutierrezMarta2425T4() {
  }

  /**
   * Constructor con cuatro parámetros para inicializar la librería
   * @param nom Nombre del libro
   * @param cantidad Cantidad de ejemplares que hay disponibles (en stock)
   * @param precio Precio del libro
   * @param saldo Saldo en la cuenta de la librería
   */
  public LibreriaFriasGutierrezMarta2425T4(String nom, int cantidad, double precio, double saldo) {
    this.nom = nom;
    this.cantidad = cantidad;
    this.precio = precio;
    this.saldo = saldo;
  }

  /**
   * Método que devuelve el nombre del libro
   * @return Nombre del libro
   */
  public String obtenerNombre() {
    return getNom();
  }

  /**
   * Método que devuelve el precio del libro
   * @return Precio del libro
   */
  public double obtenerPrecio() {
    return getPrecio();
  }

  /**
   * Método que devuelve la cantidad de libros disponibles (en stock)
   * @return Cantidad de libros disponibles (en stock)
   */
  public int obtenerStock() {
    return getCantidad();
  }

  /**
   * Método que devuelve el saldo actual de la librería
   * @return Saldo de la librería
   */
  public double obtenerSaldo() {
    return getSaldo();
  }

  /**
   * Método para aumentar el saldo de la librería.
   * @param saldomas Cantidad a incrementar en el saldo
   * @throws Exception Si la cantidad a ingresar es menor o igual a cero
   */
  public void aumentarSaldo(double saldomas) throws Exception {
    if (saldomas <= 0) {
      throw new Exception("No se puede ingresar 0 o una cantidad negativa");
    }
    setSaldo(getSaldo() + saldomas);
  }

  /**
   * Método para comprar un libro, reduciendo el stock y aumentando el saldo
   * @param canti Cantidad de libros a comprar
   * @throws Exception Si la cantidad es negativa, el stock es insuficiente o no hay saldo suficiente para comprar
   */
  public void comprarLibro(int canti) throws Exception {
    if (canti <= 0) {
      throw new Exception("No se puede retirar una cantidad negativa de libros");
    }
    if (getCantidad() >= canti) {
      if (getSaldo() <= getPrecio()) {
        throw new Exception("No hay suficiente saldo para comprar");
      } else {
        setCantidad(getCantidad() - canti);
        setSaldo(getSaldo() + (getPrecio() * canti));
      }
    } else {
      throw new Exception("No se pueden comprar más libros de los que hay disponibles");
    }

  }
}
