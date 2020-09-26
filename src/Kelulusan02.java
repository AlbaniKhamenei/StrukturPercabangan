/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import java.util.Scanner;

public class Kelulusan02 {
    public static void main(String[] args){
        // Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        // Ambil Nama
        System.out.print("Masukkan Nama Anda : ");
        String Nama = inp.next();
        
       // Ambil Jenis Kelamin
         System.out.print("Jenis Kelamin Anda : ");
        String Jenis_Kelamin = inp.next();
        
        // Ambil Tinggi Badan
         System.out.print("Masukkan Tinggi Badan Anda : ");
        int Tinggi_Badan = inp.nextInt();
         
         // Print
       
         if (Jenis_Kelamin == "Perempuan") {
             if (Tinggi_Badan <= 160){
           System.out.println("Anda Tidak Lulus");
         } else if (Tinggi_Badan <= 210 )
                System.out.println("Anda Lulus");
         }
 if (Jenis_Kelamin == "Laki - Laki") ;
    if (Tinggi_Badan <= 170){
        System.out.println("Anda Tidak Lulus");
    } else if (Tinggi_Badan <= 230 )
        System.out.println("Anda Lulus");
 }
}

    
    
       