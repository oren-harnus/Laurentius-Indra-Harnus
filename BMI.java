/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.utsbmi;

import java.util.Scanner;
public class Utsbmi {


    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int berat;
       double tinggi;
       double bmi;
       
       System.out.println("masukan berat :");
       berat = input.nextInt();
       System.out.println("masukan tinggi :");
       tinggi = input.nextDouble();
       tinggi/=100;
       bmi=berat/(tinggi*tinggi);
       System.out.println("Bmi mu adalah "+bmi);
       
      if (bmi < 18.5){
            System.out.println("kekurangan berat badan"); 
      }
      else if (bmi < 24.9){
            System.out.println("normal");
      }
      else if(bmi<28.29){
      }
      else {
          System.out.println("obesitas.");
      }
      
    }
}
