/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.Intrinsics;

public final class ACExtraResponseParam {
    private String value;

    public ACExtraResponseParam(String string2) {
        this.value = string2;
    }

    public static /* synthetic */ ACExtraResponseParam copy$default(ACExtraResponseParam aCExtraResponseParam, String string2, int n3, Object object) {
        if ((n3 &= 1) != 0) {
            string2 = aCExtraResponseParam.value;
        }
        return aCExtraResponseParam.copy(string2);
    }

    public final String component1() {
        return this.value;
    }

    public final ACExtraResponseParam copy(String string2) {
        ACExtraResponseParam aCExtraResponseParam = new ACExtraResponseParam(string2);
        return aCExtraResponseParam;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ACExtraResponseParam;
        if (!bl3) {
            return false;
        }
        object = (ACExtraResponseParam)object;
        String string2 = this.value;
        object = ((ACExtraResponseParam)object).value;
        boolean bl4 = Intrinsics.areEqual(string2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final String getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        String string2 = this.value;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        return n3;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public String toString() {
        String string2 = this.value;
        return cP.a("ACExtraResponseParam(value=", string2, ")");
    }
}

