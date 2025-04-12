/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.sis;

import java.io.Serializable;

public class DropAtStore
implements Serializable {
    private boolean isDroppableAtStore;
    private String knowMoreURL;
    private String message;
    private String storeLocatorURL;

    private static DropAtStore getSampleData() {
        String string2;
        DropAtStore dropAtStore = new DropAtStore();
        dropAtStore.isDroppableAtStore = true;
        dropAtStore.message = "App - Sample text for Return at Store";
        dropAtStore.knowMoreURL = string2 = "https://www.google.com";
        dropAtStore.storeLocatorURL = string2;
        return dropAtStore;
    }

    public String getKnowMoreURL() {
        return this.knowMoreURL;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStoreLocatorURL() {
        return this.storeLocatorURL;
    }

    public boolean isDroppableAtStore() {
        return this.isDroppableAtStore;
    }

    public void setDroppableAtStore(boolean bl2) {
        this.isDroppableAtStore = bl2;
    }

    public void setKnowMoreURL(String string2) {
        this.knowMoreURL = string2;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setStoreLocatorURL(String string2) {
        this.storeLocatorURL = string2;
    }
}

