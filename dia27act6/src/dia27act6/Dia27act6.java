package dia27act6;

import dia27act6.Entidad.Curso;
import dia27act6.Servicio.ServicioCurso;

public class Dia27act6 {

    public static void main(String[] args) {
        ServicioCurso sc = new ServicioCurso();
        Curso c = sc.init();
        
        sc.Cargar_Alumnos(c);
        System.out.println("");
        sc.Crear_Curso(c);
        System.out.println("");
        sc.Calcular_Ganancia(c);
    }
    
}
