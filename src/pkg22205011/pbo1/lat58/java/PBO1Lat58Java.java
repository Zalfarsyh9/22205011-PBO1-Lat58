/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pkg22205011.pbo1.lat58.java;

/**
 *
 * @author User 
 * Nama : Zalfa Rosiyah Riski 
 * Nim : 22205011 
 * Jurusan : Teknik Informatika 
 * Deskripsi : Membuat program dengan tambah kurang bilangan
 */
class Bilangan {

    protected int x;
    protected int y;

    public Bilangan() {
        this.x = 3;
        this.y = 4;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class JumlahBilangan extends Bilangan {

    public void tampilHasilJumlah() {
        System.out.println("Hasil Penjumlahan = " + (getX() + getY()));
    }
}

class SelisihBilangan extends Bilangan {

    public void tampilSelisih() {
        System.out.println("Hasil Selisih " + getX() + " - " + getY() + " = " + (getX() - getY()));
    }
}

public class PBO1Lat58Java {

    public static void main(String[] args) {
        //Membuat objek JumlahBilangan
        JumlahBilangan jm = new JumlahBilangan();
        jm.tampilHasilJumlah();

        //Membuat objek Selisih Bilangan
        SelisihBilangan sb = new SelisihBilangan();
        sb.tampilSelisih();

    }
}
