/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class mainlimas {
    public static void main(String[] args){
        LimasSegiEmpat limas1 = new LimasSegiEmpat();
        System.out.println("Volume Limas Segi Empat dengan sisi " + limas1.getSisi() + " dan tinggi " + limas1.getTinggi() + " adalah " + limas1.getVolume());
        
        LimasSegiEmpat limas2 = new LimasSegiEmpat(9,17);
        System.out.println("Volume Limas Segi EMpat dengan sisi " + limas2.getSisi() + " dan tinggi " + limas2.getTinggi() + " adalah " + limas2.getVolume());
    }
}
