/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.CMSProduct$Companion;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

public final class CMSProduct {
    public static final CMSProduct$Companion Companion;
    private final String productId;

    static {
        CMSProduct$Companion cMSProduct$Companion;
        Companion = cMSProduct$Companion = new CMSProduct$Companion(null);
    }

    public CMSProduct() {
        this(null, 1, null);
    }

    public /* synthetic */ CMSProduct(int n3, String string2, a03_0 a03_02) {
        if ((n3 &= 1) == 0) {
            n3 = 0;
            this.productId = null;
        } else {
            this.productId = string2;
        }
    }

    public CMSProduct(String string2) {
        this.productId = string2;
    }

    public /* synthetic */ CMSProduct(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ CMSProduct copy$default(CMSProduct cMSProduct, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = cMSProduct.productId;
        }
        return cMSProduct.copy(string2);
    }

    public static final /* synthetic */ void write$Self$shared_release(CMSProduct object, u30_0 u30_02, SerialDescriptor serialDescriptor) {
        Object object2;
        boolean bl2 = u30_02.I(serialDescriptor, 0);
        if (bl2 || (object2 = ((CMSProduct)object).productId) != null) {
            object2 = pe3_2.a;
            object = ((CMSProduct)object).productId;
            u30_02.r(serialDescriptor, 0, (b03_0)object2, object);
        }
    }

    public final String component1() {
        return this.productId;
    }

    public final CMSProduct copy(String string2) {
        CMSProduct cMSProduct = new CMSProduct(string2);
        return cMSProduct;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CMSProduct;
        if (!bl3) {
            return false;
        }
        object = (CMSProduct)object;
        String string2 = this.productId;
        object = ((CMSProduct)object).productId;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getProductId() {
        return this.productId;
    }

    public int hashCode() {
        int n3;
        String string2 = this.productId;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public String toString() {
        String string2 = this.productId;
        return cP.a("CMSProduct(productId=", string2, ")");
    }
}

