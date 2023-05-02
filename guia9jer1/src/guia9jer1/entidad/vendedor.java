package guia9jer1.entidad;

import java.util.Date;

public class vendedor {
     private String nombre;
     private Integer dni;
     private double sueldobasic;
     private double comision;
     private double sueldoMens;
     private Date fechaInicio;

    public vendedor() {
    }

    public vendedor(String nombre, Integer dni, double sueldobasic, double comision, double sueldoMens, Date fechaInicio) {
        this.nombre = nombre;
        this.dni = dni;
        this.sueldobasic = sueldobasic;
        this.comision = comision;
        this.sueldoMens = sueldoMens;
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getDni() {
        return dni;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public double getSueldobasic() {
        return sueldobasic;
    }

    public void setSueldobasic(double sueldobasic) {
        this.sueldobasic = sueldobasic;
    }

    public double getComision() {
        return comision;
    }

    public void setComision(double comision) {
        this.comision = comision;
    }

    public double getSueldoMens() {
        return sueldoMens;
    }

    public void setSueldoMens(double sueldoMens) {
        this.sueldoMens = sueldoMens;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }
     
     
}
