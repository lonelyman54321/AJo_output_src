/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Product
implements Serializable {
    private String code;

    public Product() {
        this(null, 1, null);
    }

    public Product(String string2) {
        this.code = string2;
    }

    public /* synthetic */ Product(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ Product copy$default(Product product, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = product.code;
        }
        return product.copy(string2);
    }

    public final String component1() {
        return this.code;
    }

    public final Product copy(String string2) {
        Product product = new Product(string2);
        return product;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Product;
        if (!bl3) {
            return false;
        }
        object = (Product)object;
        String string2 = this.code;
        object = ((Product)object).code;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getCode() {
        return this.code;
    }

    public int hashCode() {
        int n3;
        String string2 = this.code;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public final void setCode(String string2) {
        this.code = string2;
    }

    public String toString() {
        String string2 = this.code;
        return cP.a("Product(code=", string2, ")");
    }
}

