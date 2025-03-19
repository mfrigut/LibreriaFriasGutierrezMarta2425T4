
package libreria;

public class Main {
  
    public static void main(String[] args) {
        LibreriaXXX miLibreriaXXX;
        String x;
        int stock;
        int num;
        double dinero;
        double saldoActual;
        double ingreso;
        
        miLibreriaXXX = new LibreriaXXX("Don Quijote de la Mancha", 10, 45, 120);

        try 
        {
            x = "Don Quijote de la Mancha";
            num = 2;    //Número de ejemplares a comprar
            dinero = miLibreriaXXX.obtenerPrecio();
            saldoActual = miLibreriaXXX.obtenerSaldo();
            System.out.println("El libro "+x+" vale "+dinero+"€");
            System.out.println("El saldo actual de la librería es de "+saldoActual+"€");
            miLibreriaXXX.comprarLibro(num);
        } catch (Exception e)
        {
            System.out.println("Error en la compra del libro");
        }
        
        saldoActual = miLibreriaXXX.obtenerSaldo();
        System.out.println("El saldo al comprar el libro es de "+ saldoActual );        
        x = miLibreriaXXX.obtenerNombre();
        stock = miLibreriaXXX.obtenerStock();
        System.out.println("El libro "+x+" tiene un stock de "+stock+" unidades ahora");
        
        try
        {
            ingreso = 30.5; //Ingreso que se va a realizar en el saldo de la librería
            miLibreriaXXX.aumentarSaldo(ingreso);
            saldoActual = miLibreriaXXX.obtenerSaldo();
            System.out.println("Tu saldo actual después de ingresar es de "+saldoActual+"€");
        } catch (Exception e)
        {
            System.out.println("Fallo al obtener el saldo al ingresar");
        }
    }
}
