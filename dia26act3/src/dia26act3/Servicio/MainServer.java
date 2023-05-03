package dia26act3.Servicio;

import dia26act3.Entidad.A;
import dia26act3.Entidad.B;
import java.util.Arrays;

public class MainServer {
    
    A a = new A();
    B b = new B();
    
    public A Ainit(){
        return a;
    }
    public B Binit(){
        return b;
    }
    
    public void initA(A a){
        double[] x = new double[50];
        for(int i = 0; i < a.getA().length; i++){  
        x[i] = (double) (Math.random()*50 + 1);
        
        }
        a.setA(x);
    }
    
    public void Mostrar(A a){
        for(int i = 0; i < a.getA().length; i++){  
        System.out.print(""+Arrays.toString(a.getA())+", ");            
        }
        System.out.println("");
    }
    
    public void Oredn(A a){
        Arrays.sort(a.getA());
        for(int i = 0; i < a.getA().length; i++){  
             
            System.out.print(""+Arrays.toString(a.getA())+", ");
                
            }
        System.out.println("");
    }
      
    public void init_B(B b){
    double[] z = new double[20];
    
    z = Arrays.copyOfRange(a.getA(), 0, 9);
    b.setB(z);
    
    for(int i = 0; i < b.getB().length; i++){ 
    System.out.print(""+Arrays.toString(b.getB())+", ");   
    }
    
    Arrays.fill(z,0.5);
    b.setB(z);
    
    for(int i = 0; i < b.getB().length; i++){
    System.out.print(""+Arrays.toString(b.getB())+", "); 
    }
    System.out.println("");
    }
    
    }
    
