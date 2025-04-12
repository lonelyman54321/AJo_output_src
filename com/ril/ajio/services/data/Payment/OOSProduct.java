/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class OOSProduct
implements Serializable {
    private List cartModifications;

    public OOSProduct() {
        this(null, 1, null);
    }

    public OOSProduct(List list) {
        this.cartModifications = list;
    }

    public /* synthetic */ OOSProduct(List list, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            list = null;
        }
        this(list);
    }

    public static /* synthetic */ OOSProduct copy$default(OOSProduct oOSProduct, List list, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            list = oOSProduct.cartModifications;
        }
        return oOSProduct.copy(list);
    }

    public final List component1() {
        return this.cartModifications;
    }

    public final OOSProduct copy(List list) {
        OOSProduct oOSProduct = new OOSProduct(list);
        return oOSProduct;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof OOSProduct;
        if (!bl3) {
            return false;
        }
        object = (OOSProduct)object;
        List list = this.cartModifications;
        object = ((OOSProduct)object).cartModifications;
        boolean bl4 = Intrinsics.areEqual(list, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getCartModifications() {
        return this.cartModifications;
    }

    public int hashCode() {
        int n3;
        List list = this.cartModifications;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        return n3;
    }

    public final void setCartModifications(List list) {
        this.cartModifications = list;
    }

    public String toString() {
        List list = this.cartModifications;
        StringBuilder stringBuilder = new StringBuilder("OOSProduct(cartModifications=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

