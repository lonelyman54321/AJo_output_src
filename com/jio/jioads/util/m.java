/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.util;

import kotlin.jvm.internal.Intrinsics;

public final class m {
    public final String a;
    public final long b;

    public m(String string2, long l2) {
        Intrinsics.checkNotNullParameter(string2, "userAgent");
        this.a = string2;
        this.b = l2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof m;
        if (!bl3) {
            return false;
        }
        object = (m)object;
        String string2 = this.a;
        String string3 = ((m)object).a;
        bl3 = Intrinsics.areEqual(string2, string3);
        if (!bl3) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((m)object).b;
        long l4 = l2 - l3;
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != false) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        long l2 = this.b;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("UserAgentHolder(userAgent=");
        String string2 = this.a;
        stringBuilder.append(string2);
        stringBuilder.append(", saveTime=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

