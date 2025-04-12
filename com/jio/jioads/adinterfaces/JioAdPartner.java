/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.adinterfaces;

public class JioAdPartner {
    public String a;
    public String b;

    public JioAdPartner() {
        String string2;
        this.a = string2 = "UNKNOWN";
        this.b = string2;
    }

    public String getPartnerName() {
        return this.a;
    }

    public String getPartnerSDKVersion() {
        return this.b;
    }

    public void setPartnerName(String string2) {
        this.a = string2;
    }

    public void setPartnerSDKVersion(String string2) {
        this.b = string2;
    }
}

