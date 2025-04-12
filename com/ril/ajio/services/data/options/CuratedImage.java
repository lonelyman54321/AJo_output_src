/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.options;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class CuratedImage {
    private String mobileProductListingImage;
    private String product;

    public CuratedImage() {
        this(null, null, 3, null);
    }

    public CuratedImage(String string2, String string3) {
        this.product = string2;
        this.mobileProductListingImage = string3;
    }

    public /* synthetic */ CuratedImage(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = null;
        }
        if ((n3 &= 2) != 0) {
            string3 = null;
        }
        this(string2, string3);
    }

    public static /* synthetic */ CuratedImage copy$default(CuratedImage curatedImage, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = curatedImage.product;
        }
        if ((n3 &= 2) != 0) {
            string3 = curatedImage.mobileProductListingImage;
        }
        return curatedImage.copy(string2, string3);
    }

    public final String component1() {
        return this.product;
    }

    public final String component2() {
        return this.mobileProductListingImage;
    }

    public final CuratedImage copy(String string2, String string3) {
        CuratedImage curatedImage = new CuratedImage(string2, string3);
        return curatedImage;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CuratedImage;
        if (!bl3) {
            return false;
        }
        object = (CuratedImage)object;
        String string2 = this.product;
        String string3 = ((CuratedImage)object).product;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.mobileProductListingImage;
        object = ((CuratedImage)object).mobileProductListingImage;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getMobileProductListingImage() {
        return this.mobileProductListingImage;
    }

    public final String getProduct() {
        return this.product;
    }

    public int hashCode() {
        int n3;
        String string2 = this.product;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.mobileProductListingImage;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setMobileProductListingImage(String string2) {
        this.mobileProductListingImage = string2;
    }

    public final void setProduct(String string2) {
        this.product = string2;
    }

    public String toString() {
        String string2 = this.product;
        String string3 = this.mobileProductListingImage;
        return uc0_0.a("CuratedImage(product=", string2, ", mobileProductListingImage=", string3, ")");
    }
}

