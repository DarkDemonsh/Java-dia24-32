package guia9jer1.Servicio;

import guia9jer1.entidad.vendedor;
import java.util.Date;
import java.util.Scanner;

public class ServicioVendedor {
    
    vendedor v1 = new vendedor();
        
    Scanner leer = new Scanner(System.in);
    
    public vendedor altaVendedor(){

        System.out.println("Ingrese nombre del vendedor");
        v1.setNombre(leer.next());
        System.out.println("Ingrese DNI");
        v1.setDni(leer.nextInt());
        System.out.println("Ingrese sueldo basico");
        v1.setSueldobasic(leer.nextDouble());
        System.out.println("Ingresar el dia de inicio");
        int dia = leer.nextInt();
        System.out.println("ingrese el mes de inicio");
        int mes = leer.nextInt();
        System.out.println("Ingrese el año de inicio");
        int año = leer.nextInt();
        Date fecha = new Date(año-1900,mes-1,dia);
        v1.setFechaInicio(fecha);
        
        return v1;
    }
    
    public void SueldoMensual(vendedor v1){
        
        System.out.println("ingrese las ventas totales");
        Double ventas = leer.nextDouble();
        v1.setComision(ventas*0.15);
        v1.setSueldoMens(v1.getSueldobasic()+v1.getComision());
        System.out.println("el sueldo mensual del vendedor "+v1.getNombre()+" es: "+v1.getSueldoMens());
   
    }
    
    public void vacaciones(vendedor v1){
        Date hoy = new Date();
        int anti = hoy.getYear() - v1.getFechaInicio().getYear();
        
        if(anti < 5){
            System.out.println("Le corresponden 14 dias de vacaciones");
        }else if(anti < 10){
            System.out.println("Le corresponden 21 dias de vacaciones");
        }else if(anti < 20){
            System.out.println("le corresponden 28 dias de vacaciones");
        }else if(anti > 20){
            System.out.println("le corresponden 35 dias de vacaciones");
        }else{
            System.out.println("el empleado tiene vacaciones proporcionales");
        }
        
    }
    
}
