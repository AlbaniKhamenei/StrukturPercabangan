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
public class BobotNilaiSwitch {
     public static void main(String[] args){
 Scanner input = new Scanner (System.in);

 char huruf = input.next().charAt(0);
 System.out.print("Nilai Huruf = ");
 switch (huruf){
 case 'A':
 System.out.println("Nilai angka 4");
 break;
 case 'B':
 System.out.println("Nilai angka 3");
 break;
 case 'C':
 System.out.println("Nilai angka 2");
 break;
 case 'D':
 System.out.println("Nilai angka 1");
 break;
 case 'E':
 System.out.println("Nilai angka 0");
 break;

 }
 }
}
