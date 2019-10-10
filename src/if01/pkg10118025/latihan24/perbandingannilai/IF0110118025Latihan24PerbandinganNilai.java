/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if01.pkg10118025.latihan24.perbandingannilai;

import java.util.Scanner;

/**
 * Nama     : Rizki Restu Illahi
 * NIM      : 10118025
 * Kelas    : IF-01
 * 
 */
public class IF0110118025Latihan24PerbandinganNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int nilai1;
        int nilai2;
        String kondisi, status;
        Scanner scan = new Scanner(System.in);
        
        do{
            System.out.println("====Program Perbandingan Nilai====");
            System.out.print("Masukkan Nilai Pertama : ");
            nilai1 = scan.nextInt();
            System.out.print("Masukkan Nilai Kedua : ");
            nilai2 = scan.nextInt();
            
            kondisi = (nilai1 > nilai2)? "Lebih Besar dari " : "Lebih Kecil dari ";
            System.out.printf("Hasil %d %s %d\n", nilai1, kondisi, nilai2);
            
            System.out.print("Ulangi Aktifitas(Ya/TIdak) : ");
            status = scan.next();
            System.out.println("");
        }while (status.equals("Ya")||status.equals("ya"));
    }
    
}
