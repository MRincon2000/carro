/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package carro;

/**
 *
 * @author Estudiante
 */
public class Motor {
    private int potencia;
    private Eje eje;
    public Motor(int potencia, Eje eje) {
        this.potencia = potencia;
        this.eje= eje;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }
    public Eje getEje() {
        return eje;
    }

    public void setEje(Eje eje) {
        this.eje = eje;
    }
    
}
