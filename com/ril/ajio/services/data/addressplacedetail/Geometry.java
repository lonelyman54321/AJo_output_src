/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.addressplacedetail;

import com.ril.ajio.services.data.addressplacedetail.Location;
import com.ril.ajio.services.data.addressplacedetail.Viewport;

public class Geometry {
    private Location location;
    private Viewport viewport;

    public Location getLocation() {
        return this.location;
    }

    public Viewport getViewport() {
        return this.viewport;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public void setViewport(Viewport viewport) {
        this.viewport = viewport;
    }
}

