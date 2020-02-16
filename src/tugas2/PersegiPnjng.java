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
public class PersegiPnjng extends BangunDatar{
    public PersegiPnjng(double panjang, double lebar){
      super(panjang,lebar);
   }

    @Override
   protected double Luas(){
      return (panjang*lebar);
   }

    @Override
   protected double Keliling(){
      return (2*(panjang+lebar));
   }
}
