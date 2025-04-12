/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Payment;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class Wallet {
    private String code;

    public Wallet() {
        this(null, 1, null);
    }

    public Wallet(String string2) {
        this.code = string2;
    }

    public /* synthetic */ Wallet(String string2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        if ((n3 &= 1) != 0) {
            string2 = null;
        }
        this(string2);
    }

    public static /* synthetic */ Wallet copy$default(Wallet wallet, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = wallet.code;
        }
        return wallet.copy(string2);
    }

    public final String component1() {
        return this.code;
    }

    public final Wallet copy(String string2) {
        Wallet wallet = new Wallet(string2);
        return wallet;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Wallet;
        if (!bl3) {
            return false;
        }
        object = (Wallet)object;
        String string2 = this.code;
        object = ((Wallet)object).code;
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
        return cP.a("Wallet(code=", string2, ")");
    }
}

