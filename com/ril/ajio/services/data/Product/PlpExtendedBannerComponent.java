/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.util.ArrayList;

public final class PlpExtendedBannerComponent {
    private ArrayList banners;
    private final String bottomPadding;
    private Integer carouselTimer;
    private final String componentName;
    private final Boolean fitToWidth;
    private final String heading;
    private String type;

    public final ArrayList getBanners() {
        return this.banners;
    }

    public final String getBottomPadding() {
        return this.bottomPadding;
    }

    public final Integer getCarouselTimer() {
        return this.carouselTimer;
    }

    public final String getComponentName() {
        return this.componentName;
    }

    public final Boolean getFitToWidth() {
        return this.fitToWidth;
    }

    public final String getHeading() {
        return this.heading;
    }

    public final String getType() {
        return this.type;
    }

    public final void setBanners(ArrayList arrayList) {
        this.banners = arrayList;
    }

    public final void setCarouselTimer(Integer n3) {
        this.carouselTimer = n3;
    }

    public final void setType(String string2) {
        this.type = string2;
    }
}

