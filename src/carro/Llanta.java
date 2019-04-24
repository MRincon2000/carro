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
public class Llanta {
    
    private String marca;
    private String diametro;

    public Llanta(String marca, String diametro) {
        this.marca = marca;
        this.diametro = diametro;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getDiametro() {
        return diametro;
    }

    public void setDiametro(String diametro) {
        this.diametro = diametro;
    }
    
    
    
    
}
