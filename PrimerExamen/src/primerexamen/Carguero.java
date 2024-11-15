
package primerexamen;


public class Carguero extends Nave implements Explorable{
    private static final int MIN_CARGA = 100;
    private static final int MAX_CARGA = 500;
    private int capacidadCarga;

    public Carguero(String nombre, int tripulacion, int anioLanzamiento, int capacidadCarga) {
        super(nombre, tripulacion, anioLanzamiento);
        if (capacidadCarga < MIN_CARGA || capacidadCarga > MAX_CARGA){ //puedo hacer un metodo
            throw new IllegalArgumentException("Valor de carga no valid"); //NaveDuplicadaException("Valor de carga no valid")
        }
        this.capacidadCarga = capacidadCarga;
    }
    
    @Override
    public void explorar(){
        System.out.println("El caguero " + getNombre() + "explorando...");
    }
    
    @Override
    public String toString() {
        return "Carguero{" + "capacidadCarga=" + capacidadCarga + super.toString() + "}"; //el toString puede estar al principio
    }
    
    //public boolean validarCarga(){ YA ESTA EN EL COSTRUCTOR
    //    
    //}
}
