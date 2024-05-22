package Modelo;

 //La clase Reservacion representa una reserva de vuelo para un pasajero en un sistema de gestión de reservas.
 //Cada reserva tiene un identificador único, un pasajero asociado, un vuelo reservado y un número de asiento asignado.
public class Reservacion {
    private String id; // Identificador único de la reserva
    private Pasajero pasajero; // Pasajero asociado a la reserva
    private Vuelo vuelo; // Vuelo reservado
    private int numeroAsiento; // Número de asiento asignado en el vuelo

    //Constructor que inicializa una Reservacion con los datos proporcionados.
    public Reservacion(String id, Pasajero pasajero, Vuelo vuelo, int numeroAsiento) {
        this.id = id;
        this.pasajero = pasajero;
        this.vuelo = vuelo;
        this.numeroAsiento = numeroAsiento;
    }

    //Método para obtener el identificador único de la reserva.
    public String getId() {
        return id;
    }

    //Método para establecer el identificador único de la reserva.
    public void setId(String id) {
        this.id = id;
    }

    //Método para obtener el pasajero asociado a la reserva.
    public Pasajero getPasajero() {
        return pasajero;
    }

    //Método para establecer el pasajero asociado a la reserva.
    public void setPasajero(Pasajero pasajero) {
        this.pasajero = pasajero;
    }

    //Método para obtener el vuelo reservado.
    public Vuelo getVuelo() {
        return vuelo;
    }

    //Método para establecer el vuelo reservado.
    public void setVuelo(Vuelo vuelo) {
        this.vuelo = vuelo;
    }

     //Método para obtener el número de asiento asignado en el vuelo.
    public int getNumeroAsiento() {
        return numeroAsiento;
    }

     //Método para establecer el número de asiento asignado en el vuelo.
    public void setNumeroAsiento(int numeroAsiento) {
        this.numeroAsiento = numeroAsiento;
    }
}
