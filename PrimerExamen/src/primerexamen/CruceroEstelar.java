
package primerexamen;


public class CruceroEstelar extends Nave{
    private int cantPasajeros;

    public CruceroEstelar(String nombre, int tripulacion, int anioLanzamiento, int cantPasajeros) {
        super(nombre, tripulacion, anioLanzamiento);
        this.cantPasajeros = cantPasajeros;
    }
        
    @Override
    public String toString() {
        return "CruceroEstelar{" + super.toString() + "cantPasajeros=" + cantPasajeros + "}"; //el toString puede estar al principio
    }
}
