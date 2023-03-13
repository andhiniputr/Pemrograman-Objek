/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class mainbalok {
    public static void main(String[] args){
        balok balok1 = new balok();
        System.out.println("Volume balok dengan lebar " + balok1.getLebar() +" panjang " + balok1.getPanjang() +" tinggi " + balok1.getTinggi() +" adalah " + balok1.getVolume());
        
        balok balok2 = new balok(5,7,6);
        System.out.println("Volume balok dengan lebar " + balok2.getLebar() +" panjang " + balok2.getPanjang() +" tinggi " + balok2.getTinggi() +" adalah " + balok2.getVolume());
}
}