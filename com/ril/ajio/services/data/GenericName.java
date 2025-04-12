/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.io.Serializable;

public class GenericName
implements Serializable {
    private String isocode;
    private String name;

    public String getIsocode() {
        return this.isocode;
    }

    public String getName() {
        return this.name;
    }

    public void setIsocode(String string2) {
        this.isocode = string2;
    }

    public void setName(String string2) {
        this.name = string2;
    }
}

