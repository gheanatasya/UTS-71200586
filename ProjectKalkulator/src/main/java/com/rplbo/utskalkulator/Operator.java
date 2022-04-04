package com.rplbo.utskalkulator;

public class Operator {
    private String operatorString;
    private String operatorSimbol;

    public void Operator(String operatorString){
        String oprstring = this.operatorString;
        if (oprstring == "kali"){
            operatorSimbol = "*";
        }else if (oprstring == "bagi"){
            operatorSimbol = "/";
        }else if (oprstring == "tambah"){
            operatorSimbol = "+";
        }else if (oprstring == "kurang"){
            operatorSimbol = "-";
        }else if (oprstring == "pangkat"){
            operatorSimbol = "^";
        }
    }

    public String getOperatorSimbol(){
        return this.operatorSimbol;
    }
}
