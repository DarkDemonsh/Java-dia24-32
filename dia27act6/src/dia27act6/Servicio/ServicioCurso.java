package dia27act6.Servicio;

import dia27act6.Entidad.Curso;
import java.util.Arrays;
import java.util.Scanner;

public class ServicioCurso {
    
    Curso c = new Curso();
    Scanner leer = new Scanner(System.in);

    public Curso init(){  
        return c;
    }
         
    public void Cargar_Alumnos(Curso c){
     String[] n = new String[5];
     String[] z = new String[5];
     
     for(int i = 0; i<c.getNombreCurso().length; i++){
         System.out.println("ingrese el nombre del alumno");
         n[i] = leer.next();
         c.setNombreCurso(n);
         System.out.println("va de mañana(M) o de tarde(T)");
         z[i] = leer.next();
         c.setTurno(z);
     } 
    
    }
    
    public void Crear_Curso(Curso c){
        
         System.out.println("Los alumnos son: "+Arrays.toString(c.getNombreCurso())+" truno: "+Arrays.toString(c.getTurno()));    

    }
    
     public void Calcular_Ganancia(Curso c){
    
         System.out.println("Ingrese el precio por hora");
         c.setPrecio(leer.nextInt());
         System.out.println("ingrese la cantidad de horas");
         c.setHoras(leer.nextInt());
         System.out.println("ingrese la cantidad de dias");
         c.setDias(leer.nextInt());
         
         int ganancia = c.getHoras()*c.getPrecio()*5*c.getDias();
         
         System.out.println("");
         System.out.println("usted gana: $"+ganancia+" por semana");
         
     }
        
    
}
