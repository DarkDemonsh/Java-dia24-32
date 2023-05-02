package guia9jer1;

import guia9jer1.Servicio.ServicioVendedor;
import guia9jer1.entidad.vendedor;

public class Guia9jer1 {

    public static void main(String[] args) {
        ServicioVendedor sv = new ServicioVendedor();
        vendedor v1 = sv.altaVendedor();
        
        sv.SueldoMensual(v1);
        sv.vacaciones(v1);
    }
    
}
