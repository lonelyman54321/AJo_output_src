/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.addressplacedetail;

import java.util.ArrayList;

public class AddressComponents {
    private String longName;
    private String shortName;
    private ArrayList types;

    public String getLongName() {
        return this.longName;
    }

    public String getShortName() {
        return this.shortName;
    }

    public ArrayList getTypes() {
        return this.types;
    }

    public void setLongName(String string2) {
        this.longName = string2;
    }

    public void setShortName(String string2) {
        this.shortName = string2;
    }

    public void setTypes(ArrayList arrayList) {
        this.types = arrayList;
    }
}

