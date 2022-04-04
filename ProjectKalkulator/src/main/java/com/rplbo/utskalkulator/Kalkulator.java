package com.rplbo.utskalkulator;

import java.util.Scanner;

public class Kalkulator {
    private int bil2;
    private int bil1;
    private String op;

    public Kalkulator(BilanganString bil2, BilanganString bil1, Operator op){
        this.bil2 = bil2;
        this.bil1 = bil1;
        this.op = op;
    }

    public void hitung(){
        op = this.op;
        if (op.OperatorSimbol() == "+"){
            hasil = bil2 + bil1;
        }else if (op.OperatorSimbol() == "-"){
            hasil = bil2 - bil1;
        }else if (op.OperatorSimbol() == "*"){
            hasil = bil2 * bil1;
        }else if (op.OperatorSimbol() == "/"){
            hasil = bil2 / bil1;
        }else if (op.OperatorSimbol() == "^"){
            hasil = Math.pow(bil2, bil1);
        }
        System.out.println("Hasil: " + hasil);
    }
}
