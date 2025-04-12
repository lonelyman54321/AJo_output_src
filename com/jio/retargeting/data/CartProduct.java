/*
 * Decompiled with CFR 0.152.
 */
package com.jio.retargeting.data;

import com.jio.jioads.adinterfaces.JioAds;
import com.jio.retargeting.data.Product;
import kotlin.jvm.internal.Intrinsics;

public final class CartProduct {
    private Product product;
    private int quantity;

    public CartProduct(Product product, int n3) {
        int n4;
        this.product = product;
        this.quantity = n4 = this.validateQuantity(n3);
    }

    public CartProduct(String string2, int n3, int n4, String string3, String string4, String string5, String string6) {
        int n7;
        Product product = new Product(string2, n3, string3, string4, string5, string6);
        this(product, n4);
        this.product = product = new Product(string2, n3, string3, string4, string5, string6);
        this.quantity = n7 = this.validateQuantity(n4);
    }

    private final int validateQuantity(int n3) {
        int n4 = 1;
        if (n3 < n4) {
            String string2 = "message";
            Intrinsics.checkNotNullParameter("Argument quantity must be greater than zero", string2);
            JioAds.Companion.getInstance().getLogLevel$jio_ads_sdk_exo_media_3Location_21SsaiCommonVideoModuleCompanionNativeDynamicDisplayInstreamAudioInstreamVideoInterstitialMediationRetargetingCarouselRelease();
        }
        return n3;
    }

    public final String getBrickname() {
        Object object = this.product;
        object = object != null ? ((Product)object).e : null;
        return object;
    }

    public final int getPrice() {
        int n3;
        Product product = this.product;
        if (product != null) {
            n3 = product.b;
        } else {
            n3 = 0;
            product = null;
        }
        return n3;
    }

    public final String getProductId() {
        Object object = this.product;
        object = object != null ? ((Product)object).a : null;
        return object;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public final String getSegment() {
        Object object = this.product;
        object = object != null ? ((Product)object).c : null;
        return object;
    }

    public final String getSkuName() {
        Object object = this.product;
        object = object != null ? ((Product)object).f : null;
        return object;
    }

    public final String getVertical() {
        Object object = this.product;
        object = object != null ? ((Product)object).d : null;
        return object;
    }
}

