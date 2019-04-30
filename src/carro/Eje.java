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
public class Eje {
private String marca;
private Motor motor;
private Llanta[] llantas;

public Eje(String marca){
    this.llantas= new Llanta[2];
    this.marca=marca;

}
public boolean nuevaLLanta(Llanta llanta){
    for (int i=0;i < llantas.length;i++){
        if (llantas[i]==null){
            llantas[i]=llanta;
            return true;
        }
    }
    return false;
}
public boolean agregarMotor(Motor motor1){
    this.motor=motor1;
    return true;
}
public Llanta getLlantas(int i){
return llantas[i];
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

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

}
