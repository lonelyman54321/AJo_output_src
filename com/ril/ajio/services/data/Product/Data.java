/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import com.ril.ajio.services.data.Product.PriceRevealMetaInfo;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class Data
implements Serializable {
    private final PriceRevealMetaInfo priceRevealMetaInfo;
    private final List products;

    public Data(PriceRevealMetaInfo priceRevealMetaInfo, List list) {
        Intrinsics.checkNotNullParameter(list, "products");
        this.priceRevealMetaInfo = priceRevealMetaInfo;
        this.products = list;
    }

    public static /* synthetic */ Data copy$default(Data data, PriceRevealMetaInfo priceRevealMetaInfo, List list, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            priceRevealMetaInfo = data.priceRevealMetaInfo;
        }
        if ((n3 &= 2) != 0) {
            list = data.products;
        }
        return data.copy(priceRevealMetaInfo, list);
    }

    public final PriceRevealMetaInfo component1() {
        return this.priceRevealMetaInfo;
    }

    public final List component2() {
        return this.products;
    }

    public final Data copy(PriceRevealMetaInfo priceRevealMetaInfo, List list) {
        Intrinsics.checkNotNullParameter(list, "products");
        Data data = new Data(priceRevealMetaInfo, list);
        return data;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Data;
        if (!bl3) {
            return false;
        }
        object = (Data)object;
        Object object2 = this.priceRevealMetaInfo;
        PriceRevealMetaInfo priceRevealMetaInfo = ((Data)object).priceRevealMetaInfo;
        bl3 = Intrinsics.areEqual(object2, priceRevealMetaInfo);
        if (!bl3) {
            return false;
        }
        object2 = this.products;
        object = ((Data)object).products;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final PriceRevealMetaInfo getPriceRevealMetaInfo() {
        return this.priceRevealMetaInfo;
    }

    public final List getProducts() {
        return this.products;
    }

    public int hashCode() {
        int n3;
        PriceRevealMetaInfo priceRevealMetaInfo = this.priceRevealMetaInfo;
        if (priceRevealMetaInfo == null) {
            n3 = 0;
            priceRevealMetaInfo = null;
        } else {
            n3 = priceRevealMetaInfo.hashCode();
        }
        return ((Object)this.products).hashCode() + (n3 *= 31);
    }

    public String toString() {
        PriceRevealMetaInfo priceRevealMetaInfo = this.priceRevealMetaInfo;
        List list = this.products;
        StringBuilder stringBuilder = new StringBuilder("Data(priceRevealMetaInfo=");
        stringBuilder.append(priceRevealMetaInfo);
        stringBuilder.append(", products=");
        stringBuilder.append(list);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

