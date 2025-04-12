/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data.dash;

import com.jio.jioads.jioreel.data.dash.b;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public final String a;
    public final long b;
    public final long c;
    public final long d;
    public final String e;
    public final b f;

    public a(String string2, long l2, long l3, long l4, String string3, b b2) {
        Intrinsics.checkNotNullParameter(string2, "id");
        Intrinsics.checkNotNullParameter((Object)b2, "type");
        this.a = string2;
        this.b = l2;
        this.c = l3;
        this.d = l4;
        this.e = string3;
        this.f = b2;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof a;
        if (!object2) {
            return false;
        }
        object = (a)object;
        String string2 = this.a;
        Object object3 = ((a)object).a;
        object2 = Intrinsics.areEqual(string2, object3);
        if (!object2) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((a)object).b;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.c;
        l3 = ((a)object).c;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        l2 = this.d;
        l3 = ((a)object).d;
        long l8 = l2 - l3;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object3 = this.e;
        string2 = ((a)object).e;
        object2 = Intrinsics.areEqual(object3, string2);
        if (!object2) {
            return false;
        }
        object3 = this.f;
        object = ((a)object).f;
        if (object3 != object) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = string2.hashCode() * 31;
        long l2 = this.b;
        int n4 = 32;
        long l3 = l2 >>> n4;
        int n7 = ((int)(l2 ^= l3) + n3) * 31;
        long l4 = this.c;
        l3 = l4 >>> n4;
        int n8 = ((int)(l4 ^= l3) + n7) * 31;
        l3 = this.d;
        long l7 = l3 >>> n4 ^ l3;
        n3 = ((int)l7 + n8) * 31;
        String string3 = this.e;
        if (string3 == null) {
            n8 = 0;
            string3 = null;
        } else {
            n8 = string3.hashCode();
        }
        n3 = (n3 + n8) * 31;
        return ((Object)((Object)this.f)).hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Period(id=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", startTime=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", endTime=");
        l2 = this.c;
        stringBuilder.append(l2);
        stringBuilder.append(", duration=");
        l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", vastId=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", type=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

