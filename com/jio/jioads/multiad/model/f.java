/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.multiad.model;

import com.jio.jioads.multiad.model.g;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.internal.Intrinsics;

public final class f {
    public String a = null;
    public g b = null;
    public int c = 0;
    public HashMap d = null;
    public long e;
    public boolean f;
    public String g;
    public ArrayList h;
    public long i;
    public String j;
    public int k;
    public String l;

    public f() {
        long l2;
        this.e = l2 = 0L;
        this.f = false;
        this.g = null;
        this.h = null;
        this.i = l2;
        this.j = null;
        this.k = 0;
        this.l = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof f;
        if (n3 == 0) {
            return false;
        }
        object = (f)object;
        Object object2 = this.a;
        Object object3 = ((f)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object2 = this.b;
        object3 = ((f)object).b;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.c;
        int n4 = ((f)object).c;
        if (n3 != n4) {
            return false;
        }
        object2 = this.d;
        object3 = ((f)object).d;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        long l2 = this.e;
        long l3 = ((f)object).e;
        long l4 = l2 - l3;
        n3 = (int)(l4 == 0L ? 0 : (l4 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        n3 = (int)(this.f ? 1 : 0);
        n4 = (int)(((f)object).f ? 1 : 0);
        if (n3 != n4) {
            return false;
        }
        object2 = this.g;
        object3 = ((f)object).g;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        object2 = this.h;
        object3 = ((f)object).h;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        l2 = this.i;
        l3 = ((f)object).i;
        long l7 = l2 - l3;
        n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
        if (n3 != 0) {
            return false;
        }
        object2 = this.j;
        object3 = ((f)object).j;
        n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
        if (n3 == 0) {
            return false;
        }
        n3 = this.k;
        n4 = ((f)object).k;
        if (n3 != n4) {
            return false;
        }
        object2 = this.l;
        object = ((f)object).l;
        boolean bl3 = Intrinsics.areEqual(object2, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        Object object = this.a;
        int n7 = 0;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n4 *= 31;
        Object object2 = this.b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((g)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.c + n4) * 31;
        object = this.d;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = object.hashCode();
        }
        n3 = (n3 + n4) * 31;
        long l2 = this.e;
        n4 = 32;
        long l3 = l2 >>> n4;
        int n8 = ((int)(l2 ^= l3) + n3) * 31;
        n3 = (int)(this.f ? 1 : 0);
        if (n3 != 0) {
            n3 = 1;
        }
        n8 = (n8 + n3) * 31;
        object2 = this.g;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n8 = (n8 + n3) * 31;
        object2 = this.h;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((ArrayList)object2).hashCode();
        }
        n8 = (n8 + n3) * 31;
        long l4 = this.i;
        l3 = l4 >>> n4;
        n4 = ((int)(l4 ^= l3) + n8) * 31;
        object2 = this.j;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.k + n4) * 31;
        object = this.l;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n3 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Campaign(id=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", config=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", weight=");
        int n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", ads=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", skipExpiry=");
        long l2 = this.e;
        stringBuilder.append(l2);
        stringBuilder.append(", isPgmAd=");
        n3 = (int)(this.f ? 1 : 0);
        stringBuilder.append(n3 != 0);
        stringBuilder.append(", pgmUrl=");
        object = this.g;
        stringBuilder.append((String)object);
        stringBuilder.append(", pgmStatusUrl=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", pgmExpiry=");
        l2 = this.i;
        stringBuilder.append(l2);
        stringBuilder.append(", pgmQuery=");
        object = this.j;
        stringBuilder.append((String)object);
        stringBuilder.append(", pgmMethod=");
        n3 = this.k;
        stringBuilder.append(n3);
        stringBuilder.append(", campaignType=");
        object = this.l;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

