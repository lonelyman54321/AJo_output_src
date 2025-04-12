/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import com.ril.ajio.services.data.Payment.Product;
import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Entry
implements Serializable {
    private Product product;

    public Entry() {
        this(null, 1, null);
    }

    public Entry(Product product) {
        this.product = product;
    }

    public /* synthetic */ Entry(Product product, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            product = null;
        }
        this(product);
    }

    public static /* synthetic */ Entry copy$default(Entry entry, Product product, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            product = entry.product;
        }
        return entry.copy(product);
    }

    public final Product component1() {
        return this.product;
    }

    public final Entry copy(Product product) {
        Entry entry = new Entry(product);
        return entry;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Entry;
        if (!bl3) {
            return false;
        }
        object = (Entry)object;
        Product product = this.product;
        object = ((Entry)object).product;
        boolean bl4 = Intrinsics.areEqual(product, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Product getProduct() {
        return this.product;
    }

    public int hashCode() {
        int n3;
        Product product = this.product;
        if (product == null) {
            n3 = 0;
            product = null;
        } else {
            n3 = product.hashCode();
        }
        return n3;
    }

    public final void setProduct(Product product) {
        this.product = product;
    }

    public String toString() {
        Product product = this.product;
        StringBuilder stringBuilder = new StringBuilder("Entry(product=");
        stringBuilder.append(product);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

