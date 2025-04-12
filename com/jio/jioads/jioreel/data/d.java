/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.jioreel.data;

import com.jio.jioads.jioreel.data.a;
import kotlin.jvm.internal.Intrinsics;

public final class d {
    public final a a;
    public final long b;
    public final String c;
    public final long d;
    public boolean e;
    public boolean f;
    public boolean g;
    public final String h;

    public d(a a2, long l2, String string2, long l3, String string3, int n3) {
        if ((n3 &= 0x80) != 0) {
            string3 = "";
        }
        Intrinsics.checkNotNullParameter((Object)a2, "blackoutType");
        Intrinsics.checkNotNullParameter(string2, "creativeId");
        Intrinsics.checkNotNullParameter(string3, "heaxaCreativeId");
        this.a = a2;
        this.b = l2;
        this.c = string2;
        this.d = l3;
        this.e = false;
        this.f = false;
        this.g = false;
        this.h = string3;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof d;
        if (!object2) {
            return false;
        }
        object = (d)object;
        Object object3 = this.a;
        Object object4 = ((d)object).a;
        if (object3 != object4) {
            return false;
        }
        long l2 = this.b;
        long l3 = ((d)object).b;
        long l4 = l2 - l3;
        object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object4 = this.c;
        object3 = ((d)object).c;
        object2 = Intrinsics.areEqual(object4, object3);
        if (!object2) {
            return false;
        }
        l2 = this.d;
        l3 = ((d)object).d;
        long l7 = l2 - l3;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2) {
            return false;
        }
        object2 = this.e;
        boolean bl3 = ((d)object).e;
        if (object2 != bl3) {
            return false;
        }
        object2 = this.f;
        bl3 = ((d)object).f;
        if (object2 != bl3) {
            return false;
        }
        object2 = this.g;
        bl3 = ((d)object).g;
        if (object2 != bl3) {
            return false;
        }
        object4 = this.h;
        object = ((d)object).h;
        boolean bl4 = Intrinsics.areEqual(object4, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = ((Object)((Object)this.a)).hashCode();
        int n4 = 31;
        long l2 = this.b;
        int n7 = 32;
        long l3 = l2 >>> n7;
        int n8 = ((int)(l2 ^ l3) + (n3 *= 31)) * 31;
        String string2 = this.c;
        n3 = zy_2.b(n8, n4, string2);
        l2 = this.d;
        long l4 = l2 >>> n7;
        n8 = ((int)(l2 ^= l4) + n3) * 31;
        n3 = (int)(this.e ? 1 : 0);
        int n10 = 1;
        if (n3 != 0) {
            n3 = 1;
        }
        n8 = (n8 + n3) * 31;
        n3 = (int)(this.f ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        n8 = (n8 + n3) * 31;
        n3 = (int)(this.g ? 1 : 0);
        if (n3 == 0) {
            n10 = n3;
        }
        n8 = (n8 + n10) * 31;
        return this.h.hashCode() + n8;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("JioSpotAdModel(blackoutType=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", pdt=");
        long l2 = this.b;
        stringBuilder.append(l2);
        stringBuilder.append(", creativeId=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", id=");
        l2 = this.d;
        stringBuilder.append(l2);
        stringBuilder.append(", isStartCallback=");
        boolean bl2 = this.e;
        stringBuilder.append(bl2);
        stringBuilder.append(", isStartEventFired=");
        bl2 = this.f;
        stringBuilder.append(bl2);
        stringBuilder.append(", isEndEventFired=");
        bl2 = this.g;
        stringBuilder.append(bl2);
        stringBuilder.append(", heaxaCreativeId=");
        object = this.h;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

