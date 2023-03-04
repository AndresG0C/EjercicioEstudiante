package vista;

import modelo.Estudiante;

/**
 *
 * @author AndresG
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         
        Estudiante a = new Estudiante();
        a.setNota1(3.5);
        a.setNota2(4.4);
        a.setNota3(3.0);
        imprimirEstudiante(a);
        
        System.out.println("-------------------------------");
        
        Estudiante b = new Estudiante();
        b.setNota1(5.0);
        b.setNota2(4.5);
        b.setNota3(3.8);
        imprimirEstudiante(b);
        // TODO code application logic here
    }
    
    public static void imprimirEstudiante(Estudiante a){
        System.out.println("Promedio:"+ a.calcularPromedio());
    }
    
}
