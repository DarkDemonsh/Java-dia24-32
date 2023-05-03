package dia26act2;

import dia26act2.Entidad.Par;
import dia26act2.Servicio.ServicioPar;

public class Dia26act2 {

    public static void main(String[] args) {
        ServicioPar sp = new ServicioPar();
        Par p = sp.init();
        
        sp.Mostrar_Valores(p);
        System.out.println("");
        sp.Devolver_Mayor(p);
        System.out.println("");
        sp.Calcular_Potencia(p);
        System.out.println("");
        sp.Calcular_Raiz(p);
        System.out.println("");
        
    }
    
}
