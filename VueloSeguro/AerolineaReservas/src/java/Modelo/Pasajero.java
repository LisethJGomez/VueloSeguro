package Modelo;

 //La clase Pasajero representa a un pasajero en un sistema de gestión de pasajeros.
 //Cada pasajero tiene un nombre y un documento asociado.
public class Pasajero {
    private String nombre; // Nombre del pasajero
    private String documento; // Documento del pasajero


    public Pasajero(String nombre, String documento) {
        this.nombre = nombre;
        this.documento = documento;
    }

    public Pasajero() {
    }
    
    public String getNombre() {
        return nombre;
    }

 //Setters & Getters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDocumento() {
        return documento;
    }
    
    public void setDocumento(String documento) {
        this.documento = documento;
    }
}
