/*
 * Decompiled with CFR 0.152.
 */
package com.affise.attribution.modules;

import kotlin.jvm.internal.Intrinsics;

public final class AffiseKeyValue {
    private final String key;
    private final String value;

    public AffiseKeyValue(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        this.key = string2;
        this.value = string3;
    }

    public static /* synthetic */ AffiseKeyValue copy$default(AffiseKeyValue affiseKeyValue, String string2, String string3, int n3, Object object) {
        int n4 = n3 & 1;
        if (n4 != 0) {
            string2 = affiseKeyValue.key;
        }
        if ((n3 &= 2) != 0) {
            string3 = affiseKeyValue.value;
        }
        return affiseKeyValue.copy(string2, string3);
    }

    public final String component1() {
        return this.key;
    }

    public final String component2() {
        return this.value;
    }

    public final AffiseKeyValue copy(String string2, String string3) {
        Intrinsics.checkNotNullParameter(string2, "key");
        AffiseKeyValue affiseKeyValue = new AffiseKeyValue(string2, string3);
        return affiseKeyValue;
    }

    public boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof AffiseKeyValue;
        if (!bl3) {
            return false;
        }
        object = (AffiseKeyValue)object;
        String string2 = this.key;
        String string3 = ((AffiseKeyValue)object).key;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string2 = this.value;
        object = ((AffiseKeyValue)object).value;
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
        int n4 = string2.hashCode() * 31;
        String string3 = this.value;
        if (string3 == null) {
            n3 = 0;
            string3 = null;
        } else {
            n3 = string3.hashCode();
        }
        return n4 + n3;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder("AffiseKeyValue(key=");
        String string2 = this.key;
        stringBuilder.append(string2);
        stringBuilder.append(", value=");
        string2 = this.value;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

