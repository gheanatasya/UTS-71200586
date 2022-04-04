package com.rplbo.utstokosedia;

public class Member {
    private String alamat;
    private String nama;
    private Dompet dompet;

    public Member(String alamat, String nama){}
    public String getAlamat(){
        return this.alamat;
    }

    public void cekSaldo(){
        return this.dompet;
    }

    public void bayar(long){

    }

    public String getNama(){
        return this.nama;
    }

    public void topUp(long){}
}
