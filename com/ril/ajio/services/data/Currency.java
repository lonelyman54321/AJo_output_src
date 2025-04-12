/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.io.Serializable;

public class Currency
implements Serializable {
    private boolean active;
    private String isocode;
    private String name;
    private String symbol;

    public String getIsocode() {
        return this.isocode;
    }

    public String getName() {
        return this.name;
    }

    public String getSymbol() {
        return this.symbol;
    }

    public boolean isActive() {
        return this.active;
    }

    public void setActive(boolean bl2) {
        this.active = bl2;
    }

    public void setIsocode(String string2) {
        this.isocode = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }

    public void setSymbol(String string2) {
        this.symbol = string2;
    }
}

