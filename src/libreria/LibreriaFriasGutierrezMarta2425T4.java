package libreria;

/**
 * Clase que representa la disponibilidad (stock) de libros, sus precio y el saldo de una libreria.
 * @author Marta Fr�as Guti�rrez
 * 
 */
public class LibreriaFriasGutierrezMarta2425T4 {

  private String nom;      // Nombre del libro
  private int cantidad;     // Cantidad de ejemplares en stock
  private double precio;  // Precio unitario del libro
  private double saldo;   // Saldo de la librería

  /**
   * M�todo que obtiene el nombre del libro
   * @return Nombre del libro
   */
  public String getNom() {
    return nom;
  }

  /**
   * M�todo que establece el nombre del libro
   * @param nom Nombre del libro a establecer
   */
  public void setNom(String nom) {
    this.nom = nom;
  }

  /**
   * M�todo que obtiene la cantidad de libros disponibles (en stock)
   * @return Cantidad de libros disponibles (en stock)
   */
  public int getCantidad() {
    return cantidad;
  }

  /**
   * M�todo que establece la cantidad de libros disponibles (en stock)
   * @param cantidad Nueva cantidad de libros disponibles (en stock)
   */
  public void setCantidad(int cantidad) {
    this.cantidad = cantidad;
  }

  /**
   * M�todo que obtiene el precio de un libro
   * @return Precio del libro
   */
  public double getPrecio() {
    return precio;
  }

  /**
   * M�todo que establece el precio de un libro
   * @param precio Nuevo precio del libro
   */
  public void setPrecio(double precio) {
    this.precio = precio;
  }

  /**
   * M�todo que obtiene el saldo de la librería
   * @return Saldo actual
   */
  public double getSaldo() {
    return saldo;
  }

  /**
   * M�todo que establece el saldo de la librería
   * @param saldo Nuevo saldo a establecer
   */
  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  /**
   * Constructor sin par�metros
   */
  public LibreriaFriasGutierrezMarta2425T4() {
  }

  /**
   * Constructor con cuatro par�metros para inicializar la librer�a
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
   * M�todo que devuelve el nombre del libro
   * @return Nombre del libro
   */
  public String obtenerNombre() {
    return getNom();
  }

  /**
   * M�todo que devuelve el precio del libro
   * @return Precio del libro
   */
  public double obtenerPrecio() {
    return getPrecio();
  }

  /**
   * M�todo que devuelve la cantidad de libros disponibles (en stock)
   * @return Cantidad de libros disponibles (en stock)
   */
  public int obtenerStock() {
    return getCantidad();
  }

  /**
   * M�todo que devuelve el saldo actual de la librer�a
   * @return Saldo de la librería
   */
  public double obtenerSaldo() {
    return getSaldo();
  }

  /**
   * M�todo para aumentar el saldo de la librer�a.
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
   * M�todo para comprar un libro, reduciendo el stock y aumentando el saldo
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
