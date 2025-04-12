/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Home;

import java.io.Serializable;

public final class ImageDetail
implements Serializable {
    private int bannerPosition;
    private int componentPosition;
    private String imageUrl;

    public final int getBannerPosition() {
        return this.bannerPosition;
    }

    public final int getComponentPosition() {
        return this.componentPosition;
    }

    public final String getImageUrl() {
        return this.imageUrl;
    }

    public final void setBannerPosition(int n3) {
        this.bannerPosition = n3;
    }

    public final void setComponentPosition(int n3) {
        this.componentPosition = n3;
    }

    public final void setImageUrl(String string2) {
        this.imageUrl = string2;
    }
}

