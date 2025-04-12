/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Cart;

import java.io.Serializable;

public final class Extra
implements Serializable {
    private final int rvpPercent;

    public Extra(int n3) {
        this.rvpPercent = n3;
    }

    public static /* synthetic */ Extra copy$default(Extra extra, int n3, int n4, Object object) {
        if ((n4 &= 1) != 0) {
            n3 = extra.rvpPercent;
        }
        return extra.copy(n3);
    }

    public final int component1() {
        return this.rvpPercent;
    }

    public final Extra copy(int n3) {
        Extra extra = new Extra(n3);
        return extra;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Extra;
        if (n3 == 0) {
            return false;
        }
        object = (Extra)object;
        n3 = this.rvpPercent;
        int n4 = ((Extra)object).rvpPercent;
        if (n3 != n4) {
            return false;
        }
        return bl2;
    }

    public final int getRvpPercent() {
        return this.rvpPercent;
    }

    public int hashCode() {
        return this.rvpPercent;
    }

    public String toString() {
        return Gj0.b(this.rvpPercent, "Extra(rvpPercent=", ")");
    }
}

