package com.example.rafaelaaraujo.customTab.util;

import com.example.rafaelaaraujo.customTab.model.LineItem;

import org.joda.time.DateTime;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by rafaela.araujo on 14/06/2016.
 */
public class StringUtils {

    public static String formatToMonetary(int f, boolean showPrefix) {
        try {
            DecimalFormat formatter;
            if(showPrefix) {
                formatter = new DecimalFormat("R$ ,##0,00");
            }else{
                formatter = new DecimalFormat(",##0,00");
            }
            DecimalFormatSymbols decimalFormatSymbols = formatter.getDecimalFormatSymbols();
            formatter.setDecimalFormatSymbols(decimalFormatSymbols);

            return formatter.format(f);

        } catch (Exception e) {
            return NumberFormat.getCurrencyInstance(new Locale("pt", "BR")).format(f);
        }
    }

    public static String formatTitleListLineItem(LineItem lineItem) {
        StringBuilder sb = new StringBuilder();
        sb.append(lineItem.getTitle());
        if (lineItem.getIndex() > 0) {
            sb.append(" ");
            sb.append(lineItem.getIndex());
            sb.append("/");
            sb.append(lineItem.getCharges());
        }
        return sb.toString();
    }

    public static String fomatteDateddMMM(String dt){
            DateTime dateTime = new DateTime(dt);
            return  dateTime.toString("dd MMM");
    }
}
