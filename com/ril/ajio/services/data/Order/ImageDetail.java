/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;

public class ImageDetail
implements Serializable {
    private String imageUrl1;
    private String imageUrl2;
    private String imageUrl3;

    public String getImageUrl1() {
        return this.imageUrl1;
    }

    public String getImageUrl2() {
        return this.imageUrl2;
    }

    public String getImageUrl3() {
        return this.imageUrl3;
    }

    public void setImageUrl1(String string2) {
        this.imageUrl1 = string2;
    }

    public void setImageUrl2(String string2) {
        this.imageUrl2 = string2;
    }

    public void setImageUrl3(String string2) {
        this.imageUrl3 = string2;
    }
}

