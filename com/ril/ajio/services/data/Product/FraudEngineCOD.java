/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.Product;

import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FraudEngineCOD {
    private final String action;
    private final boolean codAllowed;

    public FraudEngineCOD() {
        this(null, false, 3, null);
    }

    public FraudEngineCOD(String string2, boolean bl2) {
        this.action = string2;
        this.codAllowed = bl2;
    }

    public /* synthetic */ FraudEngineCOD(String string2, boolean bl2, int n3, DefaultConstructorMarker defaultConstructorMarker) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = "";
        }
        if ((n3 &= 2) != 0) {
            bl2 = false;
        }
        this(string2, bl2);
    }

    public static /* synthetic */ FraudEngineCOD copy$default(FraudEngineCOD fraudEngineCOD, String string2, boolean bl2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = fraudEngineCOD.action;
        }
        if ((n3 &= 2) != 0) {
            bl2 = fraudEngineCOD.codAllowed;
        }
        return fraudEngineCOD.copy(string2, bl2);
    }

    public final String component1() {
        return this.action;
    }

    public final boolean component2() {
        return this.codAllowed;
    }

    public final FraudEngineCOD copy(String string2, boolean bl2) {
        FraudEngineCOD fraudEngineCOD = new FraudEngineCOD(string2, bl2);
        return fraudEngineCOD;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof FraudEngineCOD;
        if (!bl3) {
            return false;
        }
        object = (FraudEngineCOD)object;
        String string2 = this.action;
        String string3 = ((FraudEngineCOD)object).action;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        bl3 = this.codAllowed;
        boolean bl4 = ((FraudEngineCOD)object).codAllowed;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final String getAction() {
        return this.action;
    }

    public final boolean getCodAllowed() {
        return this.codAllowed;
    }

    public int hashCode() {
        int n3;
        String string2 = this.action;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        int n4 = this.codAllowed;
        n4 = n4 != 0 ? 1231 : 1237;
        return (n3 *= 31) + n4;
    }

    public String toString() {
        String string2 = this.action;
        boolean bl2 = this.codAllowed;
        StringBuilder stringBuilder = new StringBuilder("FraudEngineCOD(action=");
        stringBuilder.append(string2);
        stringBuilder.append(", codAllowed=");
        stringBuilder.append(bl2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

