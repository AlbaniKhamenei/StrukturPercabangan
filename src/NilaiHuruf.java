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

public class NilaiHuruf {
      public static void main(String[] args){
           // Buat Scanner
        Scanner inp = new Scanner(System.in);
        
        // Ambil Nama
        System.out.print("Masukkan Nama Anda : ");
        String Nama = inp.next();
        
        // Ambil NIM
        System.out.print("Masukkan NIM : ");
        String NIM = inp.next();
        
        // Ambil Nilai
        System.out.print("Masukkan Nilai : ");
        int Nilai = inp.nextInt();
        
          // Print
        if(Nilai < 55){
            System.out.println("Nilai Yang Anda Dapatkan E");
        }else if (Nilai < 65) {
            System.out.println("Nilai Yang Anda Dapatkan D");
        }else if (Nilai < 75) {
            System.out.println("Nilai Yang Anda Dapatkan C");
        }else if (Nilai < 85) {
            System.out.println("Nilai Yang Anda Dapatkan B");
        }else if (Nilai < 100) {
            System.out.println("Nilai Yang Anda Dapatkan A");
        }
      }
}
