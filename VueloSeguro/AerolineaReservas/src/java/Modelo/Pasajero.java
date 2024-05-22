package Modelo;

 //La clase Pasajero representa a un pasajero en un sistema de gestión de pasajeros.
 //Cada pasajero tiene un nombre y un documento asociado.
public class Pasajero {
    private String nombre; // Nombre del pasajero
    private String documento; // Documento del pasajero

    //Constructor que inicializa un Pasajero con un nombre y documento dados.
     //@param nombre    El nombre del pasajero.
     //@param documento El documento del pasajero.

    public Pasajero(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    //Constructor vacío de Pasajero.
    //Se utiliza para crear instancias de Pasajero sin información inicial.

    public Pasajero() {
    }
    
    //Método para obtener el nombre del pasajero.
    public String getNombre() {
        return nombre;
    }

    //Método para establecer el nombre del pasajero.
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //Método para obtener el documento del pasajero.
    public String getDocumento() {
        return documento;
    }
    
     //Método para establecer el documento del pasajero.
    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
