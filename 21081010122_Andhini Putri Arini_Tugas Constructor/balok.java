/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class balok {
    //atribut
    public int panjang, lebar, tinggi;
    public int volume;
    
    //constructor tanpa parameter
    public balok(){
        this.panjang = 0;
        this.lebar = 0;
        this.tinggi = 0;
        this.volume = 0;
}
  
    //constructor 3 parameter
    public balok(int panjang, int lebar, int tinggi){
        this.lebar = lebar;
        this.panjang = panjang;
        this.tinggi = tinggi;
        this.volume = this.panjang * this.lebar *  this.tinggi;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
        computeAndSetVolume();
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
        computeAndSetVolume();
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
        computeAndSetVolume();
    }
    
    public int getPanjang(){
        return panjang;
    }
    
    public int getLebar(){
        return lebar;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public void computeAndSetVolume(){
        this.volume = this.panjang * this.lebar *  this.tinggi;
    }
    
    public int getVolume(){
        return volume;
    }
}
