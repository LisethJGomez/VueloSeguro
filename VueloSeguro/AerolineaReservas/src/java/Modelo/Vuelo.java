package Modelo;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;


 //Clase que representa un vuelo, con información sobre su número, origen, destino, 
 //total de asientos, y listas de reservaciones, lista de espera y cancelaciones.

public class Vuelo {

    private String numeroVuelo; // Número del vuelo
    private String origen; // Ciudad de origen
    private String destino; // Ciudad de destino
    private int totalAsientos; // Número total de asientos en el vuelo
    private boolean[] asientos; // Array que representa los asientos ocupados
    private List<Reservacion> reservaciones; // Lista de reservaciones confirmadas
    private Queue<Reservacion> listaEspera; // Cola de espera para reservaciones
    private Stack<Reservacion> cancelarReservacion; // Pila de reservaciones canceladas

    public Vuelo(String numeroVuelo, String origen, String destino, int totalAsientos) {
        this.numeroVuelo = numeroVuelo;
        this.origen = origen;
        this.destino = destino;
        this.totalAsientos = totalAsientos;
        this.asientos = new boolean[totalAsientos];
        this.reservaciones = new ArrayList<>();
        this.listaEspera = new LinkedList<>();
        this.cancelarReservacion = new Stack<>();
    }

    public String getNumeroVuelo() { 
        return numeroVuelo; 
    }
    public void setNumeroVuelo(String numeroVuelo) { 
        this.numeroVuelo = numeroVuelo; 
    }

    public String getOrigen() { 
        return origen; 
    }
    public void setOrigen(String origen) { 
        this.origen = origen; 
    }

    public String getDestino() { 
        return destino; 
    }
    public void setDestino(String destino) { 
        this.destino = destino; 
    }

    public int getTotalAsientos() { 
        return totalAsientos; 
    }
    public void setTotalAsientos(int totalAsientos) { 
        this.totalAsientos = totalAsientos; 
    }

    public boolean[] getAsientos() { 
        return asientos; 
    }
    
    public void setAsientos(boolean[] asientos) { 
        this.asientos = asientos; 
    }

    public List<Reservacion> getReservaciones() { 
        return reservaciones; 
    }
    
    public void setReservaciones(List<Reservacion> reservaciones) { 
        this.reservaciones = reservaciones; 
    }

    public Queue<Reservacion> getListaEspera() { 
        return listaEspera; 
    }
    public void setListaEspera(Queue<Reservacion> listaEspera) { 
        this.listaEspera = listaEspera; 
    }

    public Stack<Reservacion> getCancelarReservacion() { 
        return cancelarReservacion; 
    }
    public void setCancelarReservacion(Reservacion r) { 
        this.cancelarReservacion.add(r); 
    }
}
