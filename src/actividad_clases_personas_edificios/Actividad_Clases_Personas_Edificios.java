/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad_clases_personas_edificios;
import java.util.Scanner;
/**
 *
 * @author carol
 */
public class Actividad_Clases_Personas_Edificios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner leer = new Scanner(System.in);
        Personas actividades = new Personas();
        
        actividades.setTipo("Empleada");
        actividades.setNombre("Amelia");
        actividades.setEdad(28);
        actividades.setSexo('F');
        actividades.setCurp("COAC991113MCCLGR01");
        actividades.setActividad("Jefa de Enfermeras");
            System.out.println(actividades.toString());
        int num = leer.nextInt();
        switch(num) {
            case 1:
                actividades.entrada();
                break;
            case 2:
                actividades.actividad();
                break;
            case 3:
                actividades.reseso();
                break;
            case 4:
                actividades.salida();
        }
        Edificio actividades = new Edificio();
        
        actividades.setHospital('IMSS');
        actividades.setÁrea("dereccion");
        actividades.setEnergiaEl(false);
        actividades.setEstado("Ocupado");
        actividades.setCapacidad(30);
        
            System.out.println(actividades.toString());
        int num2 = leer.nextInt();
        switch(num2) {
            case 1:
                actividades.estadoUso();
                break;
            case 2:
                actividades.condicion();
                break;
            case 3:
                actividades.capacidad();
                break;
        }    
        
    }
    
}
