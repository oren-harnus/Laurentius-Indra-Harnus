/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class matematikacangih {
  public class Matematika {
    // Overloading metode pertambahan
    public int pertambahan(int a, int b) {
        return a + b;
    }

    public double pertambahan(double a, double b) {
        return a + b;
    }

    public double pertambahan(double a, double b, double c) {
        return a + b + c;
    }

    // Overloading metode pengurangan
    public int pengurangan(int a, int b) {
        return a - b;
    }

    public double pengurangan(double a, double b) {
        return a - b;
    }
  public double pengurangan(double a, double b, double c) {
        return a - b - c;
    }

    // Overloading metode perkalian
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double perkalian(double a, double b) {
        return a * b;
    }

    public double perkalian(double a, double b, double c) {
        return a * b * c;
    }

    // Overloading metode pembagian
    public double pembagian(int a, int b) {
        return (double) a / b;
    }

  public double pembagian(double a, double b) {
        return a / b;
    }

    public double pembagian(double a, double b, double c) {
        return a / b / c;
    }

    // Overloading metode modulus
    public int modulus(int a, int b) {
        return a % b;
    }

    public double modulus(double a, double b) {
        return a % b;
    }

    public double modulus(double a, double b, double c) {
        return a % b % c;
    }
    

}


}
