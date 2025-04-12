/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.Data;
import com.ril.ajio.services.data.Product.Status;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

public final class CrossSellProducts
implements Serializable {
    private final Data data;
    private final Status status;

    public CrossSellProducts(Status status, Data data) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.status = status;
        this.data = data;
    }

    public static /* synthetic */ CrossSellProducts copy$default(CrossSellProducts crossSellProducts, Status status, Data data, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            status = crossSellProducts.status;
        }
        if ((n3 &= 2) != 0) {
            data = crossSellProducts.data;
        }
        return crossSellProducts.copy(status, data);
    }

    public final Status component1() {
        return this.status;
    }

    public final Data component2() {
        return this.data;
    }

    public final CrossSellProducts copy(Status status, Data data) {
        Intrinsics.checkNotNullParameter(status, "status");
        CrossSellProducts crossSellProducts = new CrossSellProducts(status, data);
        return crossSellProducts;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof CrossSellProducts;
        if (!bl3) {
            return false;
        }
        object = (CrossSellProducts)object;
        Object object2 = this.status;
        Status status = ((CrossSellProducts)object).status;
        bl3 = Intrinsics.areEqual(object2, status);
        if (!bl3) {
            return false;
        }
        object2 = this.data;
        object = ((CrossSellProducts)object).data;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Data getData() {
        return this.data;
    }

    public final Status getStatus() {
        return this.status;
    }

    public int hashCode() {
        int n3;
        Status status = this.status;
        int n4 = status.hashCode() * 31;
        Data data = this.data;
        if (data == null) {
            n3 = 0;
            data = null;
        } else {
            n3 = data.hashCode();
        }
        return n4 + n3;
    }

    public String toString() {
        Status status = this.status;
        Data data = this.data;
        StringBuilder stringBuilder = new StringBuilder("CrossSellProducts(status=");
        stringBuilder.append(status);
        stringBuilder.append(", data=");
        stringBuilder.append(data);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

