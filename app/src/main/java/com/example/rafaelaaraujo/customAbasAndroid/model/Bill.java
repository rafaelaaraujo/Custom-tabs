package com.example.rafaelaaraujo.customAbasAndroid.model;

import java.io.Serializable;
import java.util.List;

/**
 * Created by rafaela.araujo on 14/06/2016.
 */
public class Bill implements Serializable{
    private Summary summary;
    private String id;
    private String state;
    private List<LineItem> line_items;
    private String barcode;
    private Links _links;
    private String linha_digitavel;

    public String getLinha_digitavel() {
        return linha_digitavel;
    }

    public void setLinha_digitavel(String linha_digitavel) {
        this.linha_digitavel = linha_digitavel;
    }

    public Links get_links() {
        return _links;
    }

    public void set_links(Links _links) {
        this._links = _links;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public List<LineItem> getLine_items() {
        return line_items;
    }

    public void setLine_items(List<LineItem> line_items) {
        this.line_items = line_items;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }
}
