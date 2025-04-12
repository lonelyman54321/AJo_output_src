/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Order;

import java.io.Serializable;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class RefundAmount
implements Serializable {
    private String key;
    private String value;

    public RefundAmount() {
        this(null, null, 3, null);
    }

    public RefundAmount(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        this.key = string2;
        this.value = string3;
    }

    public /* synthetic */ RefundAmount(String string2, String string3, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        String string4 = "";
        if (n4 != 0) {
            string2 = string4;
        }
        if ((n3 &= 2) != 0) {
            string3 = string4;
        }
        this(string2, string3);
    }

    public static /* synthetic */ RefundAmount copy$default(RefundAmount refundAmount, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = refundAmount.key;
        }
        if ((n3 &= 2) != 0) {
            string3 = refundAmount.value;
        }
        return refundAmount.copy(string2, string3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final RefundAmount copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        Intrinsics.checkNotNullParameter(string3, "value");
        RefundAmount refundAmount = new RefundAmount(string2, string3);
        return refundAmount;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof RefundAmount;
        if (!bl3) {
            return false;
        }
        object = (RefundAmount)object;
        String string2 = this.key;
        String string3 = ((RefundAmount)object).key;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((RefundAmount)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getKey() {
        return this.key;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3 = this.key.hashCode() * 31;
        return this.value.hashCode() + n3;
    }

    public final void setKey(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.key = string2;
    }

    public final void setValue(String string2) {
        Intrinsics.checkNotNullParameter(string2, "<set-?>");
        this.value = string2;
    }

    public String toString() {
        String string2 = this.key;
        String string3 = this.value;
        return uc0_0.a("RefundAmount(key=", string2, ", value=", string3, ")");
    }
}

