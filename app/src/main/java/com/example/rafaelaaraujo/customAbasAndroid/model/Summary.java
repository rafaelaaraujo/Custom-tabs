package com.example.rafaelaaraujo.customAbasAndroid.model;

import java.io.Serializable;

/**
 * Created by rafaela.araujo on 14/06/2016.
 */
public class Summary implements Serializable{
    private int paid;
    private int past_balance;
    private String open_date;
    private int interest;
    private int total_cumulative;
    private String due_date;
    private int total_balance;
    private String close_date;
    private int minimum_payment;

    public int getPaid() {
        return paid;
    }

    public void setPaid(int paid) {
        this.paid = paid;
    }

    public int getPast_balance() {
        return past_balance;
    }

    public void setPast_balance(int past_balance) {
        this.past_balance = past_balance;
    }

    public String getOpen_date() {
        return open_date;
    }

    public void setOpen_date(String open_date) {
        this.open_date = open_date;
    }

    public int getInterest() {
        return interest;
    }

    public void setInterest(int interest) {
        this.interest = interest;
    }

    public int getTotal_cumulative() {
        return total_cumulative;
    }

    public void setTotal_cumulative(int total_cumulative) {
        this.total_cumulative = total_cumulative;
    }

    public String getDue_date() {
        return due_date;
    }

    public void setDue_date(String due_date) {
        this.due_date = due_date;
    }

    public int getTotal_balance() {
        return total_balance;
    }

    public void setTotal_balance(int total_balance) {
        this.total_balance = total_balance;
    }

    public String getClose_date() {
        return close_date;
    }

    public void setClose_date(String close_date) {
        this.close_date = close_date;
    }

    public int getMinimum_payment() {
        return minimum_payment;
    }

    public void setMinimum_payment(int minimum_payment) {
        this.minimum_payment = minimum_payment;
    }
}
