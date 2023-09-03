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
public class Calificacion {
  private Float nota;
    
    private Float porcentaje;

    public  Calificacion() {
    }

    public float Calificacion(Float nota, Float porcentaje) {
        this.nota = nota;
        this.porcentaje = porcentaje;
      return 0;
    }
    
    

    public Float getNota() {
        return nota;
    }

    public void setNota(Float nota) {
        this.nota = nota;
    }

    public Float getPorcentaje() {
        return porcentaje;
    }

    public void setPorcentaje(Float porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public String toString() {
        return "Calificacion{" + "nota=" + nota + ", porcentaje=" + porcentaje + '}';
    }
    
    
    
}
