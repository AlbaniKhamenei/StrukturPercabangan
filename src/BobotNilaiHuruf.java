/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Windows 10
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;



public class BobotNilaiHuruf {
    public static void main(String [] args) throws IOException {
        BufferedReader x=new BufferedReader (new InputStreamReader(System.in));
        
        String angka = "";
        System.out.print("Nilai Huruf = ");
        angka = x.readLine();
        int na=0;
        if (angka.equals("A"))
            na=4;
        else if (angka.equals("B"))
             na=3;
        else if (angka.equals("C"))
             na=2;
        else if (angka.equals("D"))
             na=1;
        else if (angka.equals("E"))
             na=0;
       System.out.println("Nilai Angka = " + na);
    }
}