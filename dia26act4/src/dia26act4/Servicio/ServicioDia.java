package dia26act4.Servicio;

import dia26act4.Entidad.Fecha;
import dia26act4.Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class ServicioDia {
   
    Scanner leer = new Scanner(System.in);
    Fecha f = new Fecha();
    Persona p = new Persona();
    
    public Fecha Fecha_Nacimiento(){
      System.out.println("Ingrese el dia de su nacimiento");
      int dia = leer.nextInt();
      System.out.println("Ingrese el mes de su nacimiento");
      int mes = leer.nextInt();
      System.out.println("Ingrese el año de su nacimiento");
      int año = leer.nextInt();
      
      Date fecha = new Date(año-1900,mes-1,dia);
      f.setFechaInicio(fecha);
      
    return f;
    }
    
    public Date Fecha_Actual(Fecha f){
     
       Date fechaAct = new Date();
      
       return fechaAct;
    }
    
    public void Edad(Fecha f){
        
        int hoy = Fecha_Actual(f).getYear() - f.getFecha().getYear();

    }
    
    public Persona Crear_Persona(){
        System.out.println("¿Cual es su nombre?");
        p.setNombre(leer.next());
        
        return p;
    }
    
    public Boolean Menor(Persona p, Fecha f){
        int hoy = Fecha_Actual(f).getYear() - f.getFecha().getYear();
        boolean x = true;
        
        if(hoy < 18){
            x = true;
        }else{
            x = false;
        }
        
        return x;   
    }
    
    public void Mostrar(Persona p, Fecha f){
        int hoy = Fecha_Actual(f).getYear() - f.getFecha().getYear();
        
        if(f.getFecha().getMonth() >= 6){
            hoy = hoy -1;
        }
        
        if(Menor(p,f)==true){
            System.out.println("Usted es menor de edad");
        }else{
            System.out.println("usted es mayor de edad");
        }
        
        System.out.println("Su nombre es: "+p.getNombre());
        System.out.println("Su edad es: "+hoy);
        
    }
    
}
