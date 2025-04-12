/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.sis;

import java.util.ArrayList;

public class SisStoreList {
    private String headerTitle;
    private String parentName;
    private ArrayList storeMetalistdto;
    private ArrayList stores;
    private String subText;

    public String getHeaderTitle() {
        return this.headerTitle;
    }

    public String getParentName() {
        return this.parentName;
    }

    public ArrayList getStoreMetalistdto() {
        return this.storeMetalistdto;
    }

    public ArrayList getStores() {
        return this.stores;
    }

    public String getSubText() {
        return this.subText;
    }

    public void setHeaderTitle(String string2) {
        this.headerTitle = string2;
    }

    public void setParentName(String string2) {
        this.parentName = string2;
    }

    public void setStoreMetalistdto(ArrayList arrayList) {
        this.storeMetalistdto = arrayList;
    }

    public void setSubText(String string2) {
        this.subText = string2;
    }
}

