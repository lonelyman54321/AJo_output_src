/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.analytics;

import kotlin.jvm.internal.Intrinsics;

public final class FbEventContentData {
    public static final int $stable = 8;
    private String id;
    private int quantity;

    public FbEventContentData(String string2, int n3) {
        this.id = string2;
        this.quantity = n3;
    }

    public static /* synthetic */ FbEventContentData copy$default(FbEventContentData fbEventContentData, String string2, int n3, int n4, Object object) {
        int n7 = n4 & 1;
        if (n7 != 0) {
            string2 = fbEventContentData.id;
        }
        if ((n4 &= 2) != 0) {
            n3 = fbEventContentData.quantity;
        }
        return fbEventContentData.copy(string2, n3);
    }

    public final String component1() {
        return this.id;
    }

    public final int component2() {
        return this.quantity;
    }

    public final FbEventContentData copy(String string2, int n3) {
        FbEventContentData fbEventContentData = new FbEventContentData(string2, n3);
        return fbEventContentData;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof FbEventContentData;
        if (n3 == 0) {
            return false;
        }
        object = (FbEventContentData)object;
        String string2 = this.id;
        String string3 = ((FbEventContentData)object).id;
        n3 = Intrinsics.areEqual(string2, string3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.quantity;
        int n4 = ((FbEventContentData)object).quantity;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final String getId() {
        return this.id;
    }

    public final int getQuantity() {
        return this.quantity;
    }

    public int hashCode() {
        int n3;
        String string2 = this.id;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n4 = this.quantity;
        return (n3 *= 31) + n4;
    }

    public final void setId(String string2) {
        this.id = string2;
    }

    public final void setQuantity(int n3) {
        this.quantity = n3;
    }

    public String toString() {
        String string2 = this.id;
        int n3 = this.quantity;
        StringBuilder stringBuilder = new StringBuilder("FbEventContentData(id=");
        stringBuilder.append(string2);
        stringBuilder.append(", quantity=");
        stringBuilder.append(n3);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

