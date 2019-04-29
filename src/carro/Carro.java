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
public class Carro {
 private Eje[] ejes;
 private Llanta[] llantas;
 private String placa;
 private String marca;
private Motor motor;
    public Carro(String placa, String marca) {
        this.placa = placa;
        this.marca = marca;
        this.llantas= new Llanta[4];
        this.ejes= new Eje[2];
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(int potencia, Eje eje) {
        this.motor =new Motor(potencia,eje);
            
    }
 public void agregarLlanta(Llanta llanta){
     for(int i=0;i<llantas.length;i++){
         if (llantas[i]==null){
             llantas[i]=llanta;
         }
     }
 }
public void agregarEje(Eje eje){
    for(int i=0;i<ejes.length;i++){
        if(ejes[i]==null){
            ejes[i]=eje;
        }
    }   
}
       
}
