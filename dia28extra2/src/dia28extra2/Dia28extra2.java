package dia28extra2;

import dia28extra2.Entidad.Game;
import dia28extra2.Servicio.ServicioGame;

public class Dia28extra2 {

    public static void main(String[] args) {
        ServicioGame sg = new ServicioGame();
        Game g = sg.init();
        
        sg.Crear_Juego(g);
        sg.longi(g);
        
        do{ 
        sg.buscar(g);
        sg.enc(g);
        sg.juego(g);
        }while(g.getPlayer() != 0);    
    }
    
}
