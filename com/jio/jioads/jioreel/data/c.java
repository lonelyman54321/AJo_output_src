/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

import com.jio.jioads.jioreel.data.b;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public final String a;
    public final long b;
    public long c;
    public final double d;
    public final b e;
    public boolean f;
    public boolean g;

    public c(String string2, long l2, double d2, b b2) {
        this.a = string2;
        this.b = l2;
        this.c = -1;
        this.d = d2;
        this.e = b2;
        this.f = false;
        this.g = false;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof c;
        if (object2 == 0) {
            return false;
        }
        object = (c)object;
        Object object3 = this.a;
        Object object4 = ((c)object).a;
        object2 = Intrinsics.areEqual(object3, object4);
        if (object2 == 0) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((c)object).b;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        l2 = this.c;
        l3 = ((c)object).c;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 != 0) {
            return false;
        }
        double d2 = this.d;
        double d5 = ((c)object).d;
        object2 = Double.compare(d2, d5);
        if (object2 != 0) {
            return false;
        }
        object4 = this.e;
        object3 = ((c)object).e;
        object2 = Intrinsics.areEqual(object4, object3);
        if (object2 == 0) {
            return false;
        }
        object2 = this.f;
        int n3 = ((c)object).f;
        if (object2 != n3) {
            return false;
        }
        object2 = this.g;
        int n4 = ((c)object).g;
        if (object2 != n4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 0;
        String string2 = this.a;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        long l2 = this.b;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = ((int)(l2 ^= l3) + (n3 *= 31)) * 31;
        long l4 = this.c;
        l3 = l4 >>> n7;
        int n10 = ((int)(l4 ^= l3) + n8) * 31;
        double d2 = this.d;
        l3 = Double.doubleToLongBits(d2);
        long l7 = l3 >>> n7 ^ l3;
        n3 = ((int)l7 + n10) * 31;
        b b2 = this.e;
        if (b2 != null) {
            n4 = b2.hashCode();
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.f ? 1 : 0);
        n10 = 1;
        if (n4 != 0) {
            n4 = 1;
        }
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.g ? 1 : 0);
        if (n4 == 0) {
            n10 = n4;
        }
        return n3 + n10;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HLSDateRangeInfo(daterangeId=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", startTime=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", endTime=");
        l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", duration=");
        double d2 = this.d;
        stringBuilder.append(d2);
        stringBuilder.append(", creativeSignalling=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", startCallback=");
        boolean bl2 = this.f;
        stringBuilder.append(bl2);
        stringBuilder.append(", endCallback=");
        bl2 = this.g;
        return AR.a(stringBuilder, bl2, ')');
    }
}

