/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Penilaian;

/**
 *
 * @author ASUS
 */
public class Main {
    public static void main(String[] args) {
        NilaiAkhir yudha = new NilaiAkhir("yudha","2110010576",90,80,88);
        
        
        System.out.println("Nama :"+yudha.getNama());
        System.out.println("NPM :"+yudha.getNpm());
        System.out.println("Nilai Akhir :"+yudha.hitungNilaiAkhir());
    }
 
}
