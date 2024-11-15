package primerexamen;


public class TestEspacial {


    public static void main(String[] args) {
        AgenciaEspacial agencia1 = new AgenciaEspacial();
    
        CruceroEstelar ce1 = new CruceroEstelar("La bella",100,2000,500); 
        
        agencia1.agregarNave(ce1);
        
        agencia1.mostrarNaves();
    }
}
