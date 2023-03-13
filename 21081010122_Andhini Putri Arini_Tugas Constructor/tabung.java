/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class tabung {
    //atribut
    public int tinggi, radius;
    public double volume;
    public double phi = 3.14;
    
    //constructor tanpa parameter
    public tabung(){
        this.radius = 0;
        this.tinggi = 0;
        this.volume = 0;
    }
    
    //constructor 2 parameter
    public tabung(int tinggi, int radius){
        this.radius = radius;
        this.tinggi = tinggi;
        this.volume = this.phi * this.radius * this.radius * this.tinggi;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
        computeAndSetVolume();
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
        computeAndSetVolume();
    }
    
    public int getRadius(){
        return radius;
    }
    
    public int getTinggi(){
        return tinggi;
    }
    
    public void computeAndSetVolume(){
        this.volume = this.phi * this.radius * this.radius * this.tinggi;
    }
    
    public double getVolume(){
        return volume;
    }
}
