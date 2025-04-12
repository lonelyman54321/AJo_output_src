/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import com.jio.jioads.instreamads.vastparser.model.p;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class e {
    public String a = null;
    public String b = null;
    public String c = null;
    public String d = null;
    public String e = null;
    public List f = null;
    public List g = null;
    public List h = null;
    public List i = null;
    public p j = null;
    public boolean k = false;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof e;
        if (!bl3) {
            return false;
        }
        object = (e)object;
        Object object2 = this.a;
        Object object3 = ((e)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((e)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((e)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((e)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((e)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object3 = ((e)object).f;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.g;
        object3 = ((e)object).g;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.h;
        object3 = ((e)object).h;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.i;
        object3 = ((e)object).i;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.j;
        object3 = ((e)object).j;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        bl3 = this.k;
        boolean bl4 = ((e)object).k;
        if (bl3 != bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        String string2 = this.a;
        int n7 = 0;
        if (string2 == null) {
            n4 = 0;
            string2 = null;
        } else {
            n4 = string2.hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.g;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.h;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.i;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.j;
        if (object != null) {
            n7 = ((p)object).hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.k ? 1 : 0);
        if (n7 != 0) {
            n7 = 1;
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("InlineElement(adSystem=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", errorUrl=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", adTitle=");
        object = this.c;
        stringBuilder.append((String)object);
        stringBuilder.append(", description=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", adservingId=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", impressionUrl=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(", creatives=");
        object = this.g;
        stringBuilder.append(object);
        stringBuilder.append(", extensions=");
        object = this.h;
        stringBuilder.append(object);
        stringBuilder.append(", omVerificationData=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(", viewableImpression=");
        object = this.j;
        stringBuilder.append(object);
        stringBuilder.append(", isFallbackAd=");
        boolean bl2 = this.k;
        return AR.a(stringBuilder, bl2, ')');
    }
}

