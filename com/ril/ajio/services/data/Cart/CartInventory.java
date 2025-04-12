/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import com.ril.ajio.services.data.Cart.pickfromstore.Status;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class CartInventory
implements Serializable {
    private final List productDetails;
    private final Status status;

    public CartInventory(List list, Status status) {
        this.productDetails = list;
        this.status = status;
    }

    public static /* synthetic */ CartInventory copy$default(CartInventory cartInventory, List list, Status status, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            list = cartInventory.productDetails;
        }
        if ((n3 &= 2) != 0) {
            status = cartInventory.status;
        }
        return cartInventory.copy(list, status);
    }

    public final List component1() {
        return this.productDetails;
    }

    public final Status component2() {
        return this.status;
    }

    public final CartInventory copy(List list, Status status) {
        CartInventory cartInventory = new CartInventory(list, status);
        return cartInventory;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CartInventory;
        if (!bl3) {
            return false;
        }
        object = (CartInventory)object;
        Object object2 = this.productDetails;
        List list = ((CartInventory)object).productDetails;
        bl3 = Intrinsics.areEqual(object2, list);
        if (!bl3) {
            return false;
        }
        object2 = this.status;
        object = ((CartInventory)object).status;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final List getProductDetails() {
        return this.productDetails;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        List list = this.productDetails;
        int n4 = 0;
        if (list == null) {
            n3 = 0;
            list = null;
        } else {
            n3 = ((Object)list).hashCode();
        }
        n3 *= 31;
        Status status = this.status;
        if (status != null) {
            n4 = status.hashCode();
        }
        return n3 + n4;
    }

    public String toString() {
        List list = this.productDetails;
        Status status = this.status;
        StringBuilder stringBuilder = new StringBuilder("CartInventory(productDetails=");
        stringBuilder.append(list);
        stringBuilder.append(", status=");
        stringBuilder.append(status);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

