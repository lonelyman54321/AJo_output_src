/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import java.io.Serializable;

public class WasPriceData
implements Serializable {
    private String currencyIso;
    private String displayformattedValue;
    private String formattedValue;
    private String priceType;
    private float value;

    public String getCurrencyIso() {
        return this.currencyIso;
    }

    public String getDisplayformattedValue() {
        return this.displayformattedValue;
    }

    public String getFormattedValue() {
        return this.formattedValue;
    }

    public String getPriceType() {
        return this.priceType;
    }

    public float getValue() {
        return this.value;
    }

    public void setCurrencyIso(String string2) {
        this.currencyIso = string2;
    }

    public void setDisplayformattedValue(String string2) {
        this.displayformattedValue = string2;
    }

    public void setFormattedValue(String string2) {
        this.formattedValue = string2;
    }

    public void setPriceType(String string2) {
        this.priceType = string2;
    }

    public void setValue(float f5) {
        this.value = f5;
    }
}

