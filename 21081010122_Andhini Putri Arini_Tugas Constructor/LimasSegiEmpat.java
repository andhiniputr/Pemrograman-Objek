/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class LimasSegiEmpat {
    //atribut
    public int sisi, tinggi;
    public double volume;
    
    //constructor tanpa parameter
    public LimasSegiEmpat(){
        this.sisi = 0;
        this.tinggi = 0;
        this.volume = 0;
    }
    
    public LimasSegiEmpat(int sisi, int tinggi){
        this.sisi = sisi;
        this.tinggi = tinggi;
        this.volume = 1 / 3 * this.sisi * this.tinggi;
    }
    
    public void setSisi(int sisi){
        this.sisi = sisi;
        computeAndSetVolume();
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
        computeAndSetVolume();
    }
    
    public int getSisi(){
        return sisi;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public void computeAndSetVolume(){
        this.volume = 1 / 3 * this.sisi * this.tinggi;
    }
    
    public double getVolume(){
        return volume;
    }
}
