/*
 * Decompiled with CFR 0.152.
 */
package com.jio.jioads.instreamads.vastparser.model;

import com.jio.jioads.instreamads.vastparser.model.f;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

public final class c {
    public String a = null;
    public String b = null;
    public f c = null;
    public List d = null;
    public String e = null;
    public final String f;

    public c() {
        this.f = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof c;
        if (!bl3) {
            return false;
        }
        object = (c)object;
        Object object2 = this.a;
        Object object3 = ((c)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((c)object).b;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.c;
        object3 = ((c)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.d;
        object3 = ((c)object).d;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.e;
        object3 = ((c)object).e;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.f;
        object = ((c)object).f;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
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
            n3 = ((f)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
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
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("Creative(sequence=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", id=");
        object = this.b;
        stringBuilder.append((String)object);
        stringBuilder.append(", linear=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", companionAds=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", universalAdId=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", universalIdName=");
        object = this.f;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

