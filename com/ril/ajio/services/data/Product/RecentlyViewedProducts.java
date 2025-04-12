/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import java.util.List;

public final class RecentlyViewedProducts {
    private PriceRevealMetaInfo priceRevealMetaInfo;
    private List productUIModelList;
    private List products;

    public PriceRevealMetaInfo getPriceRevealMetaInfo() {
        return this.priceRevealMetaInfo;
    }

    public List getProductUIModelList() {
        return this.productUIModelList;
    }

    public List getProducts() {
        return this.products;
    }

    public void setProductUIModelList(List list) {
        this.productUIModelList = list;
    }

    public void setProducts(List list) {
        this.products = list;
    }
}

