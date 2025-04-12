/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.ProductWishlistState;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class SimilarProductWishlistDataHolder {
    private ProductWishlistState productWishlistState;
    private int viewHolderPos;

    public SimilarProductWishlistDataHolder() {
        this(0, null, 3, null);
    }

    public SimilarProductWishlistDataHolder(int n3, ProductWishlistState productWishlistState) {
        Intrinsics.checkNotNullParameter((Object)productWishlistState, "productWishlistState");
        this.viewHolderPos = n3;
        this.productWishlistState = productWishlistState;
    }

    public /* synthetic */ SimilarProductWishlistDataHolder(int n3, ProductWishlistState productWishlistState, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            n3 = -1;
        }
        if ((n4 &= 2) != 0) {
            productWishlistState = ProductWishlistState.DEFAULT;
        }
        this(n3, productWishlistState);
    }

    public final ProductWishlistState getProductWishlistState() {
        return this.productWishlistState;
    }

    public final int getViewHolderPos() {
        return this.viewHolderPos;
    }

    public final void setProductWishlistState(ProductWishlistState productWishlistState) {
        Intrinsics.checkNotNullParameter((Object)productWishlistState, "<set-?>");
        this.productWishlistState = productWishlistState;
    }

    public final void setViewHolderPos(int n3) {
        this.viewHolderPos = n3;
    }
}

