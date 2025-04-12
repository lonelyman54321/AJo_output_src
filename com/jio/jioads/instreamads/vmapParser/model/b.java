/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vmapParser.model;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class b {
    public final String a;
    public final String b;
    public final ArrayList c;

    public b(String string2, String string3, ArrayList arrayList) {
        Intrinsics.checkNotNullParameter(string2, "breakType");
        Intrinsics.checkNotNullParameter(string3, "breakId");
        Intrinsics.checkNotNullParameter(arrayList, "adSources");
        this.a = string2;
        this.b = string3;
        this.c = arrayList;
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
        Object object2 = ((b)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        string2 = ((b)object).b;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object = ((b)object).c;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        String string2 = this.b;
        n3 = zy_2.b(n3, 31, string2);
        return ((Object)this.c).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AdBreak(breakType=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", breakId=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adSources=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

