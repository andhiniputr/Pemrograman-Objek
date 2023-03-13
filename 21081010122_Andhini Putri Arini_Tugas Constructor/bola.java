/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kubus;

/**
 *
 * @author andhi
 */
public class bola {
    //atribut
    public int radius;
    public double phi = 3.14;
    public double volume;
    
    //constructor tanpa parameter
    public bola(){
        this.radius = 0;
        this.volume = 0;
    }
    
    public bola(int radius){
        this.radius = radius;
        this.volume = 4 /3 * this.phi * this.radius * this.radius * this.radius;
    }
    
    public void setRadius(int radius){
        this.radius = radius;
        computeAndSetVolume();
    }
    
    public int getRadius(){
        return radius;
    }
    
    public void computeAndSetVolume(){
        this.volume = 4 /3 * this.phi * this.radius * this.radius * this.radius;
    }
    
    public double getVolume(){
        return volume;
    }
}
