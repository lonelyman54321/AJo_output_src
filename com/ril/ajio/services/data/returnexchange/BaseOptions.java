/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.returnexchange;

import com.ril.ajio.services.data.returnexchange.Selected;
import java.io.Serializable;

public final class BaseOptions
implements Serializable {
    private Selected selected;
    private String variantType;

    public final Selected getSelected() {
        return this.selected;
    }

    public final String getVariantType() {
        return this.variantType;
    }

    public final void setSelected(Selected selected) {
        this.selected = selected;
    }

    public final void setVariantType(String string2) {
        this.variantType = string2;
    }
}

