/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import java.io.Serializable;
import java.util.ArrayList;

public final class SpotLight
implements Serializable {
    private int imageToDisplay = 1;
    private boolean isProductSpotLightShown;
    private ArrayList spotLightAttributes;

    public final int getImageToDisplay() {
        return this.imageToDisplay;
    }

    public final ArrayList getSpotLightAttributes() {
        return this.spotLightAttributes;
    }

    public final boolean isProductSpotLightShown() {
        return this.isProductSpotLightShown;
    }

    public final void setImageToDisplay(int n3) {
        this.imageToDisplay = n3;
    }

    public final void setProductSpotLightShown(boolean bl2) {
        this.isProductSpotLightShown = bl2;
    }

    public final void setSpotLightAttributes(ArrayList arrayList) {
        this.spotLightAttributes = arrayList;
    }
}

