package dia26act4;

import dia26act4.Entidad.Fecha;
import dia26act4.Entidad.Persona;
import dia26act4.Servicio.ServicioDia;

public class Dia26act4 {

    public static void main(String[] args) {
        ServicioDia sd = new ServicioDia();
        Persona p = sd.Crear_Persona();
        System.out.println("");
        Fecha f = sd.Fecha_Nacimiento();        
        sd.Fecha_Actual(f);
        sd.Edad(f);
        System.out.println("");
        sd.Menor(p, f);
        System.out.println("");
        sd.Mostrar(p, f);
        System.out.println("");
    }
    
}
