package dia27act6.Entidad;

public class Curso {
    
    public String[] nombreCurso = new String[5];
    public int Horas;
    public int Dias;
    public String[] turno = new String[5];
    public int precio;

    public Curso(int Horas, int Dias, int precio) {
        this.Horas = Horas;
        this.Dias = Dias;
        this.precio = precio;
    }

    public Curso() {
    }

    public String[] getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String[] nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getHoras() {
        return Horas;
    }

    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    public int getDias() {
        return Dias;
    }

    public void setDias(int Dias) {
        this.Dias = Dias;
    }

    public String[] getTurno() {
        return turno;
    }

    public void setTurno(String[] turno) {
        this.turno = turno;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

 
}
