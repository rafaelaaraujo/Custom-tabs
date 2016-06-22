package com.example.rafaelaaraujo.customTabsAndroid.model;

import java.io.Serializable;

/**
 * Created by rafaela.araujo on 14/06/2016.
 */
public class Links implements Serializable {
    private Barcode barcode;
    private BoletoEmail boleto_email;
    private Self self;

    public Barcode getBarcode() {
        return barcode;
    }

    public void setBarcode(Barcode barcode) {
        this.barcode = barcode;
    }

    public BoletoEmail getBoleto_email() {
        return boleto_email;
    }

    public void setBoleto_email(BoletoEmail boleto_email) {
        this.boleto_email = boleto_email;
    }

    public Self getSelf() {
        return self;
    }

    public void setSelf(Self self) {
        this.self = self;
    }


    private class Barcode implements Serializable{
        private String href;
    }

    private class BoletoEmail implements Serializable{
        private String href;
    }

    private class Self implements Serializable{
        private String href;
    }
}
