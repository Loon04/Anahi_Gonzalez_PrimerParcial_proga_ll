
package primerexamen;


public class NaveExploracion extends Nave implements Explorable{
    private TipoMision tipoMision;
    
    public NaveExploracion(String nombre, int tripulacion, int anioLanzamiento, TipoMision tipoMision) {
        super(nombre, tripulacion, anioLanzamiento);
        this.tipoMision = tipoMision;
    }

    @Override
    public void explorar(){
        System.out.println("Iniciando la exploracion " + getNombre());
    }
    
    @Override
    public String toString() {
        return "NaveExploracion{" + "TipoMision= " + tipoMision + super.toString() + "}"; //el toString puede estar al principio
    }
}
