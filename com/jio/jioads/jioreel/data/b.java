/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

import kotlin.jvm.internal.Intrinsics;

public final class b {
    public final String a;
    public final String b;
    public final String c;
    public final String d;

    public b(String string2, String string3, String string4, String string5) {
        Intrinsics.checkNotNullParameter(string2, "adPosition");
        Intrinsics.checkNotNullParameter(string3, "creativeId");
        Intrinsics.checkNotNullParameter(string4, "custom_vast_data");
        Intrinsics.checkNotNullParameter(string5, "impressionId");
        this.a = string2;
        this.b = string3;
        this.c = string4;
        this.d = string5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof b;
        if (!bl3) {
            return false;
        }
        object = (b)object;
        String string2 = this.a;
        String string3 = ((b)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        string3 = this.b;
        string2 = ((b)object).b;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.c;
        string2 = ((b)object).c;
        bl3 = Intrinsics.areEqual(string3, string2);
        if (!bl3) {
            return false;
        }
        string3 = this.d;
        object = ((b)object).d;
        boolean bl4 = Intrinsics.areEqual(string3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.c;
        n3 = zy_2.b(n3, n4, string2);
        return this.d.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("CreativeSignalling(adPosition=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", creativeId=");
        string2 = this.b;
        stringBuilder.append(string2);
        stringBuilder.append(", custom_vast_data=");
        string2 = this.c;
        stringBuilder.append(string2);
        stringBuilder.append(", impressionId=");
        string2 = this.d;
        return ui0_1.a(stringBuilder, string2, ')');
    }
}

