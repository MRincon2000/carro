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

public Eje(String marca, Motor motor){
    this.llantas= new Llanta[2];
    this.marca=marca;
    this.motor=motor;
}
public boolean nuevaLLanta(Llanta llanta){
    for (int i=0;i < llantas.length;i++){
        if (llantas[i]!=null){
            llantas[i]=llanta;
            return true;
        }
    }
    return false;
}

}
