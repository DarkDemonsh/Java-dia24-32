package dia28extra1;

import dia28extra1.Entidad.Mes;
import dia28extra1.Servicio.ServicioMes;

public class Dia28extra1 {

    public static void main(String[] args) {
        ServicioMes sm = new ServicioMes();
        Mes m = sm.init();
        
        sm.int_sm(m);
        sm.Crear_Mes(m);
        
        do{
        sm.adivinar(m); 
        }while(m.isT() == false);
    }
    
}
