package dia25act1.Entidad;

public class Cadena {
    
    private String frase;
    private String word;
    private String t;

    public Cadena() {
    }

    public Cadena(String frase, String word, String t) {
        this.frase = frase;
        this.word = word;
        this.t = t;
    }

    public String getT() {
        return t;
    }

    public void setT(String t) {
        this.t = t;
    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }
    
    
    
}
