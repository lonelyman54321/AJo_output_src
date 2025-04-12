/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class NetPrice
implements Serializable {
    private Float value;

    public NetPrice() {
        this(null, 1, null);
    }

    public NetPrice(Float f5) {
        this.value = f5;
    }

    public /* synthetic */ NetPrice(Float f5, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            f5 = null;
        }
        this(f5);
    }

    public static /* synthetic */ NetPrice copy$default(NetPrice netPrice, Float f5, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            f5 = netPrice.value;
        }
        return netPrice.copy(f5);
    }

    public final Float component1() {
        return this.value;
    }

    public final NetPrice copy(Float f5) {
        NetPrice netPrice = new NetPrice(f5);
        return netPrice;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NetPrice;
        if (!bl3) {
            return false;
        }
        object = (NetPrice)object;
        Float f5 = this.value;
        object = ((NetPrice)object).value;
        boolean bl4 = Intrinsics.areEqual((Object)f5, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final Float getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        Float f5 = this.value;
        if (f5 == null) {
            n3 = 0;
            f5 = null;
        } else {
            n3 = ((Object)f5).hashCode();
        }
        return n3;
    }

    public final void setValue(Float f5) {
        this.value = f5;
    }

    public String toString() {
        Float f5 = this.value;
        StringBuilder stringBuilder = new StringBuilder("NetPrice(value=");
        stringBuilder.append(f5);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

