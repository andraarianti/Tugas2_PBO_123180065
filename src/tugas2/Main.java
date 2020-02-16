/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas2;

import java.util.Scanner;

/**
 *
 * @author User
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      double panjang, lebar;
      Data data = new Data();
      data.setNama("Andra Arianti");
      data.setNIM("123180065");
      data.setKelas("B");
      data.setMatkul("Praktikum Pemrograman Berbasis Objek");
      
      System.out.println("Nama    = " + data.getNama());
      System.out.println("NIM     = " + data.getNIM());
      System.out.println("Kelas   = " + data.getKelas());
      System.out.println("Matkul  = " + data.getMatkul());
      System.out.println("");
      
      Scanner input = new Scanner(System.in);
      System.out.print("Panjang = ");
      panjang = input.nextDouble();
      System.out.print("Lebar = ");
      lebar = input.nextDouble();
      
      PersegiPnjng p = new PersegiPnjng(panjang, lebar);
      System.out.println("===Persegi Panjang===");
      System.out.println("Panjang = " + panjang);
      System.out.println("Lebar = " + lebar);
      p.tampil();
      
    }

}