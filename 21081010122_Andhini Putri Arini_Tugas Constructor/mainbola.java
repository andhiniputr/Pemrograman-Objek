/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class mainbola {
    public static void main(String[] args){
        bola bola1 = new bola();
        System.out.println("Volume bola dengan jari  jari " + bola1.getRadius() + " adalah " + bola1.getVolume());
        
        bola bola2 = new bola(13);
        System.out.println("Volume bola dengan jari - jari " + bola2.getRadius() + " adalah " + bola2.getVolume());
    }
}
