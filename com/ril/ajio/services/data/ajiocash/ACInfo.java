/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.services.data.ajiocash;

import kotlin.jvm.internal.Intrinsics;

public final class ACInfo {
    private String key;
    private String value;

    public ACInfo(String string2, String string3) {
        this.key = string2;
        this.value = string3;
    }

    public static /* synthetic */ ACInfo copy$default(ACInfo aCInfo, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = aCInfo.key;
        }
        if ((n3 &= 2) != 0) {
            string3 = aCInfo.value;
        }
        return aCInfo.copy(string2, string3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final ACInfo copy(String string2, String string3) {
        ACInfo aCInfo = new ACInfo(string2, string3);
        return aCInfo;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ACInfo;
        if (!bl3) {
            return false;
        }
        object = (ACInfo)object;
        String string2 = this.key;
        String string3 = ((ACInfo)object).key;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((ACInfo)object).value;
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
        int n3;
        String string2 = this.key;
        int n4 = 0;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n3 *= 31;
        String string3 = this.value;
        if (string3 != null) {
            n4 = string3.hashCode();
        }
        return n3 + n4;
    }

    public final void setKey(String string2) {
        this.key = string2;
    }

    public final void setValue(String string2) {
        this.value = string2;
    }

    public String toString() {
        String string2 = this.key;
        String string3 = this.value;
        return uc0_0.a("ACInfo(key=", string2, ", value=", string3, ")");
    }
}

