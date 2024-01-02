/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UAS2;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class ShapeMain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Perhitungan Luas Lingkaran");
        System.out.println("=================================");
        System.out.print("Masukan Warna Lingkaran: ");
        String colorCircle = scanner.nextLine();
        System.out.print("Masukan Radius Lingkaran: ");
        double radius = scanner.nextDouble();
        Circle circle = new Circle(colorCircle,radius);
        System.out.println("Luas Lingkaran: "+circle.getArea());
        System.out.println("");
        System.out.println("Perhitungan Luas Persegi Panjang");
        System.out.println("====================================");
        System.out.print("Masukan Warna persegi panjang: ");
        scanner.nextLine();
        String colorRectangle = scanner.nextLine();
        System.out.print("Masukan Panjang Persegi panjang: ");
        double lenght = scanner.nextDouble();
        System.out.print("Masukan lebar Persegi panjang: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(colorRectangle,lenght,width);
        System.out.println("Luas persegi Panjang: "+rectangle.getArea());
        
        scanner.close();
        
    }
}
