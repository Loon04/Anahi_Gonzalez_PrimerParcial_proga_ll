package primerexamen;

import java.util.ArrayList;


public class AgenciaEspacial {
    private ArrayList<Nave> naves;

    public AgenciaEspacial() {
        naves = new ArrayList<>();
    }
    
    public void agregarNave(Nave nave){
        if(naves.contains(nave)){
            throw new NaveDuplicadaException();
        }
        naves.add(nave);
    }
    
    public void mostrarNaves(){
        for (Nave nave : naves){
            System.out.println(nave);
        }
        
    }
    
    public void iniciarExploracion(){
        for (Nave nave : naves){
            if(nave instanceof Explorable explorador){
                explorador.explorar();
            } else {
                System.out.println(nave.getNombre() + "no puede explorar");
            }
        }
    }
}
