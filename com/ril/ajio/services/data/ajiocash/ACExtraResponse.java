/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import com.ril.ajio.services.data.ajiocash.ACExtraResponseParam;
import kotlin.jvm.internal.Intrinsics;

public final class ACExtraResponse {
    private ACExtraResponseParam key;
    private ACExtraResponseParam value;

    public ACExtraResponse(ACExtraResponseParam aCExtraResponseParam, ACExtraResponseParam aCExtraResponseParam2) {
        this.key = aCExtraResponseParam;
        this.value = aCExtraResponseParam2;
    }

    public static /* synthetic */ ACExtraResponse copy$default(ACExtraResponse aCExtraResponse, ACExtraResponseParam aCExtraResponseParam, ACExtraResponseParam aCExtraResponseParam2, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            aCExtraResponseParam = aCExtraResponse.key;
        }
        if ((n3 &= 2) != 0) {
            aCExtraResponseParam2 = aCExtraResponse.value;
        }
        return aCExtraResponse.copy(aCExtraResponseParam, aCExtraResponseParam2);
    }

    public final ACExtraResponseParam component1() {
        return this.key;
    }

    public final ACExtraResponseParam component2() {
        return this.value;
    }

    public final ACExtraResponse copy(ACExtraResponseParam aCExtraResponseParam, ACExtraResponseParam aCExtraResponseParam2) {
        ACExtraResponse aCExtraResponse = new ACExtraResponse(aCExtraResponseParam, aCExtraResponseParam2);
        return aCExtraResponse;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ACExtraResponse;
        if (!bl3) {
            return false;
        }
        object = (ACExtraResponse)object;
        ACExtraResponseParam aCExtraResponseParam = this.key;
        ACExtraResponseParam aCExtraResponseParam2 = ((ACExtraResponse)object).key;
        bl3 = Intrinsics.areEqual(aCExtraResponseParam, aCExtraResponseParam2);
        if (!bl3) {
            return false;
        }
        aCExtraResponseParam = this.value;
        object = ((ACExtraResponse)object).value;
        boolean bl4 = Intrinsics.areEqual(aCExtraResponseParam, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final ACExtraResponseParam getKey() {
        return this.key;
    }

    public final ACExtraResponseParam getValue() {
        return this.value;
    }

    public int hashCode() {
        int n3;
        ACExtraResponseParam aCExtraResponseParam = this.key;
        int n4 = 0;
        if (aCExtraResponseParam == null) {
            n3 = 0;
            aCExtraResponseParam = null;
        } else {
            n3 = aCExtraResponseParam.hashCode();
        }
        n3 *= 31;
        ACExtraResponseParam aCExtraResponseParam2 = this.value;
        if (aCExtraResponseParam2 != null) {
            n4 = aCExtraResponseParam2.hashCode();
        }
        return n3 + n4;
    }

    public final void setKey(ACExtraResponseParam aCExtraResponseParam) {
        this.key = aCExtraResponseParam;
    }

    public final void setValue(ACExtraResponseParam aCExtraResponseParam) {
        this.value = aCExtraResponseParam;
    }

    public String toString() {
        ACExtraResponseParam aCExtraResponseParam = this.key;
        ACExtraResponseParam aCExtraResponseParam2 = this.value;
        StringBuilder stringBuilder = new StringBuilder("ACExtraResponse(key=");
        stringBuilder.append(aCExtraResponseParam);
        stringBuilder.append(", value=");
        stringBuilder.append(aCExtraResponseParam2);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

