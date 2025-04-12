/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.addressplacedetail;

import com.ril.ajio.services.data.addressplacedetail.Northeast;
import com.ril.ajio.services.data.addressplacedetail.Southwest;

public class Viewport {
    private Northeast northeast;
    private Southwest southwest;

    public Northeast getNortheast() {
        return this.northeast;
    }

    public Southwest getSouthwest() {
        return this.southwest;
    }

    public void setNortheast(Northeast northeast) {
        this.northeast = northeast;
    }

    public void setSouthwest(Southwest southwest) {
        this.southwest = southwest;
    }
}

