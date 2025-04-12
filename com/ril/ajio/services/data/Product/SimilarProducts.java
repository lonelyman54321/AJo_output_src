/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import java.util.List;

public class SimilarProducts {
    private PriceRevealMetaInfo priceRevealMetaInfo;
    private List similarProducts;
    private List similarProudctUiModel;

    public PriceRevealMetaInfo getPriceRevealMetaInfo() {
        return this.priceRevealMetaInfo;
    }

    public List getSimilarProducts() {
        return this.similarProducts;
    }

    public List getSimilarProudctUiModel() {
        return this.similarProudctUiModel;
    }

    public void setSimilarProudctUiModel(List list) {
        this.similarProudctUiModel = list;
    }
}

