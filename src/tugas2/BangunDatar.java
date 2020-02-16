/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

/**
 *
 * @author User
 */
public class BangunDatar {
    protected double panjang, lebar;

   public BangunDatar(double p, double l){
      panjang = p;
      lebar = l;
   }

   protected double Luas(){
      return 0;
   }
 
   protected double Keliling(){
      return 0;
   }

   public void tampil(){
      System.out.println("Luasnya       : "+Luas());
      System.out.println("Kelilingnya   : "+Keliling());

   }
}
