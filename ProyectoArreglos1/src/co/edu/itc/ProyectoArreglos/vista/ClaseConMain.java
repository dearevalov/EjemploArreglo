/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.itc.ProyectoArreglos.vista;
import co.edu.itc.ProyectoArreglos.negocio.CalcularCalificacion;
import co.edu.itc.ProyectoArreglos.negocio.Calificacion;
import java.util.Scanner;

/**
 *
 * @author yeram
 */
public class ClaseConMain {
    
    private static Scanner sc = new Scanner(System.in);
    
    public static void main(String [] args){
        
        System.out.println("Bienvenido");
        System.out.println("Digite la cantidad de notas");
        int tamano = Integer.parseInt(sc.next());
        Calificacion[] misCalificaciones = new Calificacion[tamano];
        
        for(int i =1; i< misCalificaciones.length+1; i++){
            Calificacion c =  new Calificacion();
            System.out.println("digite la calificación "+i);
            c.setNota(Float.parseFloat(sc.next()));
            System.out.println("Digite el Porcentaje de esa calificación");
            c.setPorcentaje(Float.parseFloat(sc.next()));
            misCalificaciones[i-1] = c;
            
        }
        CalcularCalificacion cc =  new CalcularCalificacion();
        
        System.out.println("Listar Calificaciones");
        cc.recorrerYMostrarArreglo(misCalificaciones);
        System.out.println("La nota final es "+cc.calcularCalificacion(misCalificaciones)); 
        System.out.println("La frecuencia acumulada es"+cc.CalcualarFrecuenciaAbsoluta(misCalificaciones, tamano, tamano));
        
    }
    
}
