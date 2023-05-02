package dia25act1.Servicio;

import dia25act1.Entidad.Cadena;
import java.util.Scanner;

public class ServicioCadena {
    
    Scanner leer = new Scanner(System.in);
    Cadena c = new Cadena();

    public Cadena init(){
       System.out.println("Ingrese una frase");
        c.setFrase(leer.nextLine());
        return c;
    }
    
  
    
    public void Mostrar_Vocal(Cadena c){
        int vocal = 0;
 
        int s = c.getFrase().length();
        
        for(int i = 0; i < s; i++){
         if((c.getFrase().charAt(i) == 'a')||(c.getFrase().charAt(i) == 'e')||(c.getFrase().charAt(i) == 'i')||(c.getFrase().charAt(i) == 'o')||(c.getFrase().charAt(i) == 'u')){
              vocal = vocal + 1;
         }
         
        }
        System.out.println("la frase contiene "+vocal+" vocales");
    }
   
    public void Invertir_Frase(Cadena c){
        System.out.println("");
        
        int l = c.getFrase().length();
        int s = l;
       for(int i = l-1; -1 < i; i--){
           
           System.out.print(c.getFrase().charAt(i));   
           
       } 
        System.out.println("");
    }
    
    public int VecesRepetido(Cadena c){
        int l = c.getFrase().length();
        System.out.println("Ingrese un caracter de la frase");
        String let = leer.next();
        char t = let.charAt(0);
        int le = 0;
        for(int i = 1; i < l; i++){
            
        if((c.getFrase().charAt(i) == t)){
            le = le + 1;
        }
        }
        System.out.print("La letra: "+let+" se repite: "+le+" veces");
        System.out.println("");
     return le;  
    }
    
    public Cadena Compara_Long(Cadena c){
        int l = c.getFrase().length();
        
        int k = c.getWord().length();
        
        if(l < k){
            System.out.println("la frase "+c.getFrase()+" es de mayor longitud");
        }else{
            System.out.println("la frase "+c.getWord()+" es de mayor longitud");
        } 
        return c;
    }
    
    public void Unir(Cadena c1){
        
        System.out.println("Las 2 frases unidas: "+c.getFrase()+" "+c.getWord());
        
    }
    
    public void Replace(Cadena c){
        int l = c.getFrase().length();
        System.out.println("Ingrese un caracter para reemplazar la letra |A|");
        c.setT(leer.next()); 
    
        String nfrase = c.getFrase().replace("a",c.getT());
        
        System.out.println("la frase queda tal que: "+nfrase); 
        System.out.println("");
        }
    
    
    
    public void Content(Cadena c){
        int l = c.getFrase().length();
        int d = 0;
        System.out.println("Ingrese una nueva letra");
        String r = leer.next();
        char s = r.charAt(0);
        for(int i = 1; i < l; i++){ 
            if(c.getFrase().charAt(i) == s){
                d = 1;
            }else{
                d = 0;
            }
        }
        
        if(d == 1){
            System.out.println("la frase ["+c.getFrase()+"] contiene la letra "+r);
        }else{
            System.out.println("la frase ["+c.getFrase()+"] no contiene la letra "+r);
        }
        System.out.println("");
    }
}
