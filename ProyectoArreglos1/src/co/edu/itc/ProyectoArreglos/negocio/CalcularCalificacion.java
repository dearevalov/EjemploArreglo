/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.itc.ProyectoArreglos.negocio;

/**
 *
 * @author Familia
 */
public class CalcularCalificacion {
 public void recorrerYMostrarArreglo(Calificacion[] array){
    for(Calificacion ca : array){
            System.out.println(ca.getNota());
        }
    }
    
    public Float calcularCalificacion(Calificacion[] array){
        Float notaTotal=0F;
        Float totalPorcentaje = calcularPorcentaje(array);
    if(totalPorcentaje == 100){
        for(Calificacion ca : array){
        notaTotal+=ca.getNota()*(ca.getPorcentaje()/100);
        }
        }else{
            System.out.println("El porcentaje de calificaciones está errado");
        }
    return notaTotal;
    }
    
    public Float calcularPorcentaje(Calificacion[] array){
        Float totalPorcentaje = 0F;
    for(Calificacion ca : array){
        totalPorcentaje+=ca.getPorcentaje();
        }
    
    return totalPorcentaje;
    }
    public Float CalcualarFrecuenciaAbsoluta(Calificacion[] array,  float c, float d){
        
        Float frAbs = 0f;
        for(Calificacion ca : array){
            if (ca.getNota() >= c && ca.getNota()< d) {
	                frAbs++;
        }
    }
    return frAbs;
}
}
