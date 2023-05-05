package dia28extra1.Servicio;

import dia28extra1.Entidad.Mes;
import java.util.Random;
import java.util.Scanner;

public class ServicioMes {
    
    Mes m = new Mes();
    Scanner leer = new Scanner(System.in);
    
    public Mes init(){
        return m;
    }
    
    public void int_sm(Mes m){
      Random r = new Random(); 
      m.setSecmes(r.nextInt(12));
    }
    
    public void Crear_Mes(Mes m){
        
            switch (m.getSecmes()) {
                case 0: m.setMes("enero");
                    break;
                case 1: m.setMes("febrero");
                    break;
                case 2: m.setMes("marzo");
                    break;
                case 3: m.setMes("abril");
                    break;
                case 4: m.setMes("mayo");
                    break;
                case 5: m.setMes("junio");
                    break;
                case 6: m.setMes("julio");
                    break;
                case 7: m.setMes("agosto");
                    break;
                case 8: m.setMes("septiembre");
                    break;
                case 9: m.setMes("octubre");
                    break;
                case 10: m.setMes("noviembre");
                    break;
                case 11: m.setMes("diciembre");
                    break;
            }  
    }
    
    public void adivinar(Mes m){
        int z = 0;
        System.out.println("-------------------------------");
        System.out.print("Ingrese un mes en minuscula: ");
        m.setAd(leer.next());
        
        switch (m.getAd()) {
            case "enero":
                z = 0;
                break;
            case "febrero": z = 1;
                break;
            case "marzo": z = 2;
                break;
            case "abril": z = 3;
                break;
            case "mayo": z = 4;
                break;
            case "junio": z = 5;
                break;
            case "julio": z = 6;
                break;
            case "agosto": z = 7;
                break;
            case "septiembre": z = 8;
                break;
            case "octubre": z = 9;
                break;
            case "noviembre": z = 10;
                break;
            case "diciembre": z = 11;
                break;
        }
        
        if(z == m.getSecmes()){
            System.out.println("");
            System.out.println("Correcto el mes es: "+m.getMes());
            m.setT(true);
            System.out.println("-------------------------------");
        }else{
            System.out.println("");
            System.out.println("Incorrecto, intente nuevamente");
            m.setT(false);
        }        
    }    
}
