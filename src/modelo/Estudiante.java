package modelo;

/**
 *
 * @author AndresG
 */
public class Estudiante {
    
    private double parcial_1;
    private double parcial_2;
    private double parcial_3;
    
    public Estudiante(){
        double parcial_1 = this.parcial_1;
        double parcial_2 = this.parcial_2;
        double parcial_3 = this.parcial_3;
    }    
   
    public double getNota1(){
        return this.parcial_1;
    }
    public double getNota2(){
        return this.parcial_2;
    }
    public double getNota3(){
        return this.parcial_3;
    }
    
    public void setNota1(double parcial_1){
        this.parcial_1 = parcial_1;
    }
    public void setNota2 (double parcial_2){
        this.parcial_2 = parcial_2;
    }
    public void setNota3 (double parcial_3){
        this.parcial_3 = parcial_3;
    }
    
    public double calcularPromedio(){
        return (this.parcial_1 + this.parcial_2 + this.parcial_3)/3;
    }
}
