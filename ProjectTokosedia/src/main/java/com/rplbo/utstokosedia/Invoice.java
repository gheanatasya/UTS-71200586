package com.rplbo.utstokosedia;

public class Invoice {
    private int jumlah;
    private long tagihan;
    private Produk produk;
    private Member member;

    public Invoice(){}
    public void printInvoice(){
        System.out.println(tagihan);
    }

    public long getTagihan(){
        return tagihan;
    }

    public void buatInvoice(Produk produk, int jumlah, Member member){}
}
