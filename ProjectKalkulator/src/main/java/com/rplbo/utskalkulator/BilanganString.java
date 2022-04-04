package com.rplbo.utskalkulator;

public class BilanganString {
    private String bilanganstring;
    private int bilangan;

    public void BilanganString(String bilanganstring){
        int[] angka = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int jumlahkata = 0;
        String bil1 = bilanganstring.toLowerCase();
        String[] bil2 = bil1.split(" ");
        String angka1 = bil2[0];
        String angka2 = bil2[1];
        int i = 0;
        while (i < bil1.length()) {
            while (i < bil1.length() && bil1.charAt(i) == ' ') i++;

            if (i < bil1.length() && bil1.charAt(i) != ' ') {
                jumlahkata++;
                while (i < bil1.length() && bil1.charAt(i) != ' ') i++;
            }
        }
        if (jumlahkata == 1){
            if (angka1 == "satu"){
                bilangan = 1;
            }else if (angka1 == "dua"){
                bilangan = 2;
            }else if (angka1 == "tiga"){
                bilangan = 3;
            }else if (angka1 == "empat"){
                bilangan = 4;
            }else if (angka1 == "lima"){
                bilangan = 5;
            }else if (angka1 == "enam"){
                bilangan = 6;
            }else if (angka1 == "tujuh"){
                bilangan = 7;
            }else if (angka1 == "delapan"){
                bilangan = 8;
            }else if (angka1 == "sembilan"){
                bilangan = 9;
            }else if (angka1 == "sepuluh"){
                bilangan = 10;
            }else if (angka1 == "sebelas"){
                bilangan = 11;
            }
        }else if (jumlahkata == 2){
            if (angka1 == "dua" && angka2 == "belas"){
                bilangan = 12;
            }else if (angka1 == "tiga" && angka2 == "belas"){
                bilangan = 13;
            }else if (angka1 == "empat" && angka2 == "belas"){
                bilangan = 14;
            }else if (angka1 == "lima" && angka2 == "belas"){
                bilangan = 15;
            }else if (angka1 == "enam" && angka2 == "belas"){
                bilangan = 16;
            }else if (angka1 == "tujuh" && angka2 == "belas"){
                bilangan = 17;
            }else if (angka1 == "delapan" && angka2 == "belas"){
                bilangan = 18;
            }else if (angka1 == "sembilan" && angka2 == "belas"){
                bilangan = 19;
            }else if (angka1 == "dua" && angka2 == "puluh"){
                bilangan = 20;
            }
        }else{
            System.out.println("Angka melebihi limit!");
        }
    }

    public int getBilangan(){
        return this.bilangan;
    }

    public boolean apakahDuaDigit() {
        int jumlahkata = 0;
        int i = 0;
        while (i < bilanganstring.length()) {
            while (i < bilanganstring.length() && bilanganstring.charAt(i) == ' ') i++;

            if (i < bilanganstring.length() && bilanganstring.charAt(i) != ' ') {
                jumlahkata++;
                while (i < bilanganstring.length() && bilanganstring.charAt(i) != ' ') i++;
            }
        }
        if (jumlahkata == 2){
            return true;
        }else{
            return false;
        }
    }

    public boolean apakahLebihDari10(){
        int bil = this.bilangan;
        if (bil > 10){
            return true;
        }else{
            return false;
        }

    }
}
