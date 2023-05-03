package dia26act3;

import dia26act3.Entidad.A;
import dia26act3.Entidad.B;
import dia26act3.Servicio.MainServer;

public class Dia26act3 {

    public static void main(String[] args) {
        
     MainServer ms = new MainServer();
     A a = ms.Ainit();
     B b = ms.Binit();
     
     ms.initA(a);
     System.out.println("");
     ms.Mostrar(a);
     System.out.println("");
     ms.Oredn(a);
     System.out.println("");
     ms.init_B(b);
     System.out.println("");
     
    }
    
}
