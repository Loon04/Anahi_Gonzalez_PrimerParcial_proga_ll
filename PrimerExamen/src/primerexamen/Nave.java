package primerexamen;

import java.util.Objects;


public abstract class Nave  {
    private String nombre;
    private int tripulacion;
    private int anioLanzamiento;

    public Nave(String nombre, int tripulacion, int anioLanzamiento) {
        this.nombre = nombre;
        this.tripulacion = tripulacion;
        this.anioLanzamiento = anioLanzamiento;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public String toString() {
        return "nombre=" + nombre + ", tripulacion=" + tripulacion + ", anioLanzamiento=" + anioLanzamiento;
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, anioLanzamiento);
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        }
        if (obj == null){
            return false;
        }
        if (obj instanceof Nave other){
            return nombre.equals(other.nombre) && anioLanzamiento == other.anioLanzamiento;
        }
        return false;
    }
    
}
