/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.util.ArrayList;

public class ImageUploadResponse {
    private ArrayList imageUrls = null;
    private String message;
    private String status;

    public ArrayList getImageUrls() {
        return this.imageUrls;
    }

    public String getMessage() {
        return this.message;
    }

    public String getStatus() {
        return this.status;
    }

    public void setImageUrls(ArrayList arrayList) {
        this.imageUrls = arrayList;
    }

    public void setMessage(String string2) {
        this.message = string2;
    }

    public void setStatus(String string2) {
        this.status = string2;
    }
}

