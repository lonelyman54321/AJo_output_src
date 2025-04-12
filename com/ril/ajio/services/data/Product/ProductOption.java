/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.ProductOptionItem;
import java.io.Serializable;
import java.util.List;

public final class ProductOption
implements Serializable {
    private List options;
    private ProductOptionItem selected;
    private String variantType;

    public final List getOptions() {
        return this.options;
    }

    public final ProductOptionItem getSelected() {
        return this.selected;
    }

    public final String getVariantType() {
        return this.variantType;
    }

    public final void setOptions(List list) {
        this.options = list;
    }

    public final void setSelected(ProductOptionItem productOptionItem) {
        this.selected = productOptionItem;
    }

    public final void setVariantType(String string2) {
        this.variantType = string2;
    }
}

