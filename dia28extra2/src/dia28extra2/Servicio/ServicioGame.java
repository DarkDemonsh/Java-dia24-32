package dia28extra2.Servicio;

import dia28extra2.Entidad.Game;
import java.util.Scanner;

public class ServicioGame {
    
    Game g = new Game();
    Scanner leer = new Scanner(System.in);
    
    public Game init(){
        return g;
    }
    
    public void Crear_Juego(Game g){
        
        System.out.println("Intoduce la palabra a adivinar");
        g.setWord(leer.next());
        
        g.setLarg(g.getWord().length());  
        g.setX(g.getLarg());
        
    }
    
    public void longi(Game g){
        System.out.println("la palabra a buscar es de: "+g.getLarg()+" letras");
        System.out.println("-------------------------------------------");
    }
    
    public void buscar(Game g){
        boolean z = true;

        System.out.print("Ingrese una letra: ");
        g.setLetra(leer.next().charAt(0));
        
        for(int i = 0; i < g.getLarg(); i++){
    
           if(g.getWord().charAt(i) == g.getLetra()){ 
               int x = g.getX();
               x = x - 1;
               g.setX(x);
               System.out.println("la letra pertenece a la palabra");              
               z = true;
               break;
           }else{
               z = false;
           }
        }
        if(z == false){
            System.out.println("la letra no pertenece a la palabra");
            int f = g.getPlayer() - 1;
            g.setPlayer(f);
        }
        
        
    }
    
    public void enc(Game g){
        System.out.println("quedan: "+g.getX()+"/"+g.getLarg()+" letras");
        System.out.println("intentos: "+g.getPlayer()+"/5");
        System.out.println("-------------------------------------------");
    }
    
    public void juego(Game g){
     if(g.getPlayer() == 0){
        
         System.out.println("lo sentimos, perdiste");
         System.out.println("");
         
        }else if(g.getX() == 0){
        
            System.out.println("Ganaste la palabra era: "+g.getWord());
            System.out.println("");
            g.setPlayer(0);
        }  
    }
    
}
