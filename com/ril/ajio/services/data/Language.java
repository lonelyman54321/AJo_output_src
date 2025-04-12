/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data;

import java.io.Serializable;

public class Language
implements Serializable {
    private boolean active;
    private String isocode;
    private String name;
    private String nativeName;

    public String getIsocode() {
        return this.isocode;
    }

    public String getName() {
        return this.name;
    }

    public String getNativeName() {
        return this.nativeName;
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

    public void setNativeName(String string2) {
        this.nativeName = string2;
    }
}

