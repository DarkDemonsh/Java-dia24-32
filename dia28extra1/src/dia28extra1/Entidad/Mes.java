package dia28extra1.Entidad;

public class Mes {
    
    private String mes;
    private int secmes;
    private String ad;
    private boolean t;

    public Mes() {
    }

    public Mes(String mes, int secmes, String ad, boolean t) {
        this.mes = mes;
        this.secmes = secmes;
        this.ad = ad;
        this.t = t;
    }

    public String getMes() {
        return mes;
    }

    public void setMes(String mes) {
        this.mes = mes;
    }

    public int getSecmes() {
        return secmes;
    }

    public void setSecmes(int secmes) {
        this.secmes = secmes;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public boolean isT() {
        return t;
    }

    public void setT(boolean t) {
        this.t = t;
    }
  
}
