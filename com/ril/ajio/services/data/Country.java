/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.io.Serializable;

public class Country
implements Serializable {
    private String isocode;

    public String getIsocode() {
        return this.isocode;
    }

    public void setIsocode(String string2) {
        this.isocode = string2;
    }
}

