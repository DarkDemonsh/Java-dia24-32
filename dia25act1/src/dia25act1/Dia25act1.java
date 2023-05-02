package dia25act1;

import dia25act1.Entidad.Cadena;
import dia25act1.Servicio.ServicioCadena;
import java.util.Scanner;

public class Dia25act1 {

    public static void main(String[] args) {
        ServicioCadena sc = new ServicioCadena();
        Cadena c1 = sc.init();
        Scanner leer = new Scanner(System.in);
        
        sc.Mostrar_Vocal(c1);

        sc.Invertir_Frase(c1);
        System.out.println("");
        sc.VecesRepetido(c1);
        System.out.println("");
        System.out.println("Ingrese una nueva frase");
        c1.setWord(leer.nextLine());
        sc.Compara_Long(c1);
        System.out.println("");
        sc.Unir(c1);
        System.out.println("");
        sc.Replace(c1);
        System.out.println("");
        sc.Content(c1);

    }
    
}
