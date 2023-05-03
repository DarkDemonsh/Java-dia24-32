package dia26act2.Servicio;

import dia26act2.Entidad.Par;

public class ServicioPar {
    
    Par p = new Par ();
    
    public Par init(){
        return p;
    }
    
    public void Mostrar_Valores(Par p){
        
        System.out.println("El primer numero es: "+p.getNum());
        System.out.println("El segundo numero es: "+p.getNum1());
        
    }
    
    public void Devolver_Mayor(Par p){
        
        if(p.getNum() > p.getNum1()){
            System.out.println("el numero mayor es: "+p.getNum());
        }else{
            System.out.println("el numero mayor es: "+p.getNum1());
        }
        
    }
    
    public void Calcular_Potencia(Par p){
        
        if(p.getNum() > p.getNum1()){
            System.out.println("el numero mayor elevado al numero menor da: "+ Math.pow(p.getNum(),p.getNum1()) );
        }else{
            System.out.println("el numero mayor elevado al numero menor da: "+ Math.pow(p.getNum1(),p.getNum()) );
        }
        
    }
    
    public void Calcular_Raiz(Par p){
        
        if(p.getNum() > p.getNum1()){
            System.out.println("la raiz cuadrada de el numero menor es: "+ Math.sqrt(p.getNum()) );
        }else{
            System.out.println("la raiz cuadrada de el numero menor es: "+ Math.sqrt(p.getNum1()) );
        }
        
    }
    
}
