package com.example.rafaelaaraujo.customTabsAndroid.enuns;

/**
 * Created by rafaela.araujo on 13/06/2016.
 */
public enum StateBillEnum {
    OPEN("open"), CLOSED("closed"),OVERDUE("overdue"),FUTURE("future");

    String opt;
    StateBillEnum(String opt){
        this.opt = opt;
    }

    public static StateBillEnum getFromOpt(String opt){
        for (StateBillEnum stateBillEnum : StateBillEnum.values()) {
            if(stateBillEnum.opt.equals(opt))
                return stateBillEnum;
        }
        return null;
    }
}

