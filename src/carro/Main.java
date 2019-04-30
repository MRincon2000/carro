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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Carro carro1=new Carro("rcx168","jaguar");
    
        Llanta llanta1=new Llanta("pirelli","16");
        Llanta llanta2=new Llanta("pirelli","16");
        Llanta llanta3=new Llanta("pirelli","16");
        Llanta llanta4=new Llanta("pirelli","16");
        Eje eje1=new Eje("s");
        Eje eje2=new Eje("w");
        carro1.setMotor(500,eje1);
        eje1.agregarMotor(carro1.getMotor());
        eje1.nuevaLLanta(llanta1);
        eje1.nuevaLLanta(llanta2);
        eje2.nuevaLLanta(llanta3);
        eje2.nuevaLLanta(llanta4);
        carro1.agregarEje(eje1);
        carro1.agregarEje(eje2);
        carro1.agregarLlanta(llanta1);
        carro1.agregarLlanta(llanta2);
        carro1.agregarLlanta(llanta3);
        carro1.agregarLlanta(llanta4);
        System.out.println("Carro:");
        System.out.println(carro1.getMarca());
        System.out.println(carro1.getPlaca());
        System.out.println("Motor:");
        System.out.println(carro1.getMotor().getPotencia());
        System.out.println(carro1.getMotor().getEje().getMarca());
        for(int i=0;i<2;i++){
        System.out.println(carro1.getMotor().getEje().getLlantas(i).getDiametro()+"   "+carro1.getMotor().getEje().getLlantas(i).getMarca());
        }
        System.out.println("Ejes:");
        for (int i=0;i<2;i++){
            System.out.println(eje1.getLlantas(i).getDiametro() +"  "+eje1.getLlantas(i).getMarca()); 
        }
        System.out.println(eje1.getMarca());
        System.out.println(eje1.getMotor().getPotencia());
        for(int i=0;i<2;i++){
            System.out.println(eje2.getLlantas(i).getDiametro()+"   "+eje2.getLlantas(i).getMarca());
        }
        System.out.println(eje2.getMarca());
    }
    
}
