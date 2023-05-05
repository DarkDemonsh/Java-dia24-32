package dia28extra2.Entidad;

public class Game {
 
    private String word;
    private int player = 5;
    private char letra;
    private int larg;
    private int x;

    public Game() {
    }

    public Game(String word, int player, char letra, int larg,int x) {
        this.word = word;
        this.player = player;
        this.letra = letra;
        this.larg = larg;
        this.x = x;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int getPlayer() {
        return player;
    }

    public void setPlayer(int player) {
        this.player = player;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
        this.letra = letra;
    }

    public int getLarg() {
        return larg;
    }

    public void setLarg(int larg) {
        this.larg = larg;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    } 
    
}
