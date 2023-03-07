/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kalku;
import java.util.Scanner;

/**
 *
 * @author andhi
 */
public class Kalku {
    public static void main(String args[])
    {
         Scanner input = new Scanner(System.in);
         int number1, number2, pil ,hasil = 0;
         System.out.print("Bilangan 1 : ");
         number1=input.nextInt();
         System.out.print("Bilangan 2 : ");
         number2=input.nextInt();
         System.out.println("1. Penjumlahan");
         System.out.println("2. Pengurangan");
         System.out.println("3. Perkalian");
         System.out.println("4. Pembagian");
         System.out.println("----------------------------");
         System.out.print("Pilihan Operasi: ");
         pil=input.nextInt();
         
         switch (pil){
             case 1 : hasil=number1+number2;break;
             case 2 : hasil=number1-number2;break;
             case 3 : hasil=number1*number2;break;
             case 4 : hasil=number1/number2;break;
             default : System.out.println("Salah memasukan pilihan");
         }
         
          System.out.println("Hasil :"+hasil);
    } 
}
