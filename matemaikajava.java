/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class matemaikajava {
    public class Matematika {
       public int pertambahan(int a, int b) {
           return a + b;
       }

       public int perkalian(int a, int b) {
           return a * b;
       }
       
   }
public class MatematikaCanggih extends Matematika {
       public int modulus(int a, int b) {
           return a % b;
       }
   }
public class Matematika CanggihBeraksi {
       public static void main(String[] args) {
           Matematika Canggih= new Matematika Canggih();
           
           int a = 10;
           int b = 3;
           
           int hasilTambah = pertambahan(int a, int b);
           int hasilKali = perkalian(int a, int b);
           int hasilModulus = modulus(int a, int b);
           
           System.out.println("Hasil Pertambahan: " + hasilTambah);
           System.out.println("Hasil Perkalian: " + hasilKali);
           System.out.println("Hasil Modulus: " + hasilModulus);
       }
   }

    
}
