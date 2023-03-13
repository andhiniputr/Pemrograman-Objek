/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class maintabung {
    public static void main(String[] args){
        tabung tabung1 = new tabung();
        System.out.println("Volume tabung dengan jari - jari " + tabung1.getRadius()+ " dan tinggi " + tabung1.getTinggi() + " adalah " + tabung1.getVolume());
        
        tabung tabung2 = new tabung(7,9);
        System.out.println("Volume tabung dengan jari - jari " + tabung2.getRadius()+ " dan tinggi " + tabung2.getTinggi() + " adalah " + tabung2.getVolume());
    }
}
